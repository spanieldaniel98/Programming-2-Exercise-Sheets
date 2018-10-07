#include <stdio.h>
#include <stdlib.h>
#include <math.h>

// defines a TRIARR object type
typedef int* TRIARR;

// creates a new triangular array of size N X N
TRIARR triNew(int N);

// stores a value val in an array of size N x N at position row, col
int triStore(TRIARR as, int N, int row, int col, int val);

// reads a value from an array of size N x N at position row, col
int triFetch(TRIARR as, int N, int row, int col);


TRIARR triNew(int N){

    if(N <= 0) {
        return NULL;
    }

    int triarrSize = (N*(N + 1))/2;
    int *triarr = malloc(triarrSize * sizeof(int));
    return triarr;
}

int triStore(TRIARR as, int N, int row, int col, int val) {

    if(row >= N || col >= N || col > row || row < 0 || col < 0) {
        return -1;
    }

    int arrayIndex = (col*(col-1)) / 2 + (row-1);
    if(arrayIndex < 0) {
        return -1;
    }

    int *pointer = as+arrayIndex;
	*pointer = val;
    return 0;
}

int triFetch(TRIARR as, int N, int row, int col) {

    if(row >= N || col >= N || col > row || row < 0 || col < 0) {
        return -1;
    }

    int arrayIndex = (col*(col-1)) / 2 + (row-1);
    if(arrayIndex < 0) {
        return -1;
    }

    int *pointer = as+arrayIndex;
	return (int) *pointer;
}
