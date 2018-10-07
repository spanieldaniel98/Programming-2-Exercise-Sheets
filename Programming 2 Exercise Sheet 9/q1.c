#include <stdio.h>
#include <stdlib.h>
#include <math.h>

/* take a double d, store the memory address of the whole number part of d in wholePtr, store
   the memory address of the decimal number part of d in fracPtr, and return the sign of d */
int analyse(int *wholePtr , double *fracPtr, double d);


int analyse(int *wholePtr , double *fracPtr, double d)
{
    double wholeNum;
    *fracPtr = modf(fabs(d), &wholeNum);
    *wholePtr = wholeNum;
    if(d<0) {
        return -1;
    }
    return 1;
}
