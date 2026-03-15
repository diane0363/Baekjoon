/*
N이하의 수 중에서 가낭 큰 2의 거듭제곱수 반환 func4(N)
N은 10억 이하의 자연수
*/

int func4(int N);

int main()
{

    return 0;
};

/* for문보다는 while문을 쓰는게 더 좋다*/
func4(int N)
{
    int val = 1;
    while (2 * val <= N)
        val *= 2;
    return val;
}

int func4_1(int N)
{
    int sum = 1;
    for (int i = 0; i < N; i++)
    {
        sum *= 2;
        if (sum > N)
        {
            sum /= 2;
            return sum;
        }
    }
}
