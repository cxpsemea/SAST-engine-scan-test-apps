#include <string.h>
#include <stdlib.h>


char *checkStr( char *str ) {
    newStr = char(char*) malloc ( strlen(str) + 1 );
    strcpy( newStr, str );
    return newStr;
}

char *intermediate10( char * str ) {
    char *newStr = checkStr(str);
    
    free( str );
    
    return newStr;
}
