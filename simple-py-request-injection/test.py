from http.server import BaseHTTPRequestHandler, HTTPServer
from urllib.parse import urlparse, parse_qsl

import logic1 as logic1
import logic2 as logic2
import logic3 as logic3

class S(BaseHTTPRequestHandler):
    def _set_response(self):
        self.send_response(200)
        self.send_header('Content-type', 'text/html')
        self.end_headers()
        
        
    def doReqHandler( path, params ):
        self._set_response()
        self.wfile.write( "response: {}".format( params ) )
        
        

    def do_GET(self):
        query = urlparse( self.path )
        params = dict( parse_qsl( query.query ) )
        doReqHandler( query.path, params )

    def do_POST(self):
        content_length = int(self.headers['Content-Length']) # <--- Gets the size of data
        post_data = self.rfile.read(content_length) # <--- Gets the data itself
        query = urlparse( self.path )
        params = dict( parse_qsl( query.query ) )
        params.update( dict( parse_qsl( post_data.decode( 'utf-8' ) ) ) )
        
        doReqHandler( query.path, params )
        

def run(server_class=HTTPServer, handler_class=S, port=8080):
    logging.basicConfig(level=logging.INFO)
    server_address = ('', port)
    httpd = server_class(server_address, handler_class)
    logging.info('Starting httpd...\n')
    try:
        httpd.serve_forever()
    except KeyboardInterrupt:
        pass
    httpd.server_close()
    logging.info('Stopping httpd...\n')

if __name__ == '__main__':
    from sys import argv

    if len(argv) == 2:
        run(port=int(argv[1]))
    else:
        run()