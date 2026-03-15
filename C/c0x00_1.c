/*
N 이하의 자연수 중에서 3의 배수이거나 5의 배수인 수를 모두 합한 값 반환
func(int N) 작성
N은 5만 이하의 자연수
*/

// O(N)
func1(int N)
{
    int sum = 0;
    for (int i = 1; i <= N; i++)
    {
        if (i % 3 == 0 || i % 5 == 0)
            sum += i;
    }
    return sum;
}