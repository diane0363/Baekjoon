/*
N이 제곱수이면 1반환, 아니면 0 반환하는 func3(N) 작성
N은 10억 이하의 자연수
시간 복잡도 O(lg N)도 가능하다고..
*/
#include <stdio.h.>

int func3(N);

int main()
{

    return 0;
}

/* 시간 복잡도 O(√N)*/
int func3(N)
{
    for (int i = 0; i * i < N; i++)
    {
        if (i * i == N)
            return 1;
    }
    return 0;
}

/* 1차
 */
// int func3(N){
//     for (int i = 0; i < N;i++){
//         if(i*i == N)
//             return 1;
//     }
//     return 0;
// }