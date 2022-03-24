#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void reverse(char arr[]);

int main(void) {
  char a[10002] = { 0 }, b[10002] = { 0 }, answer[10003] = { 0 };
  int carry = 0;
  int len;

  scanf("%s%s", a, b);
  reverse(a);
  reverse(b);

  if(strlen(a) >= strlen(b)) {
    len = strlen(a);
  } else {
    len = strlen(b);
  }

  for (int i = 0; i < len; i++) {
    int sum = a[i] - '0' + b[i] - '0' + carry;

    while(sum < 0) {
      sum += '0';
    }

    if(sum >= 10) {
      sum -= 10;
      carry = 1;
    } else {
      carry = 0;
    }

    answer[i] = sum + '0';
  }

  if(carry == 1) {
    answer[len] = '1';
  }

  reverse(answer);

  printf("%s", answer);

  // printf("a: %s\n", a);
  // printf("b: %s\n", b);
}

void reverse(char arr[]) {
  int len = strlen(arr);
  for(int i = 0; i < len/2; i++) {
    char tmp = arr[i];
    arr[i] = arr[len - i - 1];
    arr[len - i - 1] = tmp;
  }
}