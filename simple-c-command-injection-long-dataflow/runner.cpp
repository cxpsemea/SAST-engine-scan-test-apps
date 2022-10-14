/*
 * runner.cpp
 *
 *  Created on: Nov 4, 2019
 *      Author: koobze
 */

#include <iostream>
#include "runner.h"
#include "intermediate1.h"

using namespace std;


Runner::Runner(void) {
	// nothing
}

Runner::~Runner(void) {
	// nothing
}

void Runner::runCommand( char* str ) {
	cout << "Running command: " << str << endl;
	system(str);
}

void Runner::runCommand2( char* str ) {
	cout << "Running command2: " << str << endl;
	system( intermediate1(str) );
}

