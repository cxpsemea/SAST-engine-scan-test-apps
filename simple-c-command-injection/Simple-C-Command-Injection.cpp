//============================================================================
// Name        : Simple-C-Command-Injection.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include "runner.h"
using namespace std;

bool check( char* str ) {
    return true;
}

int main(int argc, char *argv[] ) {
	cout << "Simple command runner" << endl;
	if ( argc == 0 ) {
		cout << "No command received" << endl;
		return 0;
	}
	cout << "Received command: " << argv[0] << endl;
    
    if ( argc >= 1 && check( argv[0] ) ) {
        Runner r;
        r.runCommand( argv[0] );
    }

    if ( argc >= 2 && check( argv[1] ) ) {
        Runner r;
        r.runCommand( argv[1] );
    }
    
    if ( argc >= 3 && check( argv[2] ) ) {
        Runner r;
        r.runCommand( argv[2] );
    }

	return 0;
}
