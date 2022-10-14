//============================================================================
// Name        : Simple-C-Command-Injection.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include "runner.h"
#include <string.h>
#include <stdlib.h>

using namespace std;

int main(int argc, char *argv[] ) {
	cout << "Simple command runner" << endl;
	if ( argc == 0 ) {
		cout << "No command received" << endl;
		return 0;
	}
	cout << "Received command: " << argv[0] << endl;

    char *myVar = (char*)malloc( strlen(argv[0]) + 1 );
    strcpy( myVar, argv[0] );
    
	Runner r;
	r.runCommand( myVar );
    free( myVar );
    
    myVar = (char*)malloc( strlen(argv[1]) + 1 );
    strcpy( myVar, argv[1] );
    
    r.runCommand2( myVar );
    free( myVar );

	return 0;
}
