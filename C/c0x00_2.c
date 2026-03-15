/*
주어진 길이 N의 int 배열 arr에서 합이 100인 서로 다른 위치의 두 원소가 존재하면 1,
존재하지 않으면 0 반환 함수 func2(int arr[], int N) 작성
arr 각 수는 0 이상 100 이하, N은 1000 이하
*/

// 시간 복잡도 O(N²)
int func2(int arr[], int N)
{
    for (int i = 0; i < N; i++)
    {
        for (int j = i + 1; j < N; j++)
        {
            if (arr[i] + arr[j] == 100)
                return 1;
        }
    }
    return 0;
}