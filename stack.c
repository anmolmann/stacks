#include<stdio.h>
#include<stdlib.h>
#include"stack.h"
struct node {
    void *item;
    struct node *next;
};
static struct node *first = NULL;
static int n = 0;
void push(void *item) {
    struct node *oldfirst = first;
    first = (struct node *)malloc(sizeof(struct node));
    first -> item = item;
    first -> next = oldfirst;
    n++;
}
void* pop() {
    void *item = first -> item;
    first = first -> next;
    n--;
    return item;
}
int size() {
    return n;
}
int isEmpty() {
    return first == NULL;
}
