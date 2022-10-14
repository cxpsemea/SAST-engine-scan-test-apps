/*
 * runner.cpp
 *
 *  Created on: Nov 4, 2019
 *      Author: koobze
 */

#include <iostream>
#include "runner.h"

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

