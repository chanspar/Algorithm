#include <stdio.h>

int main()
{
    int n;
    scanf("%d", &n);

    int arr[2][n + 1];
    for (int i = 1; i <= n; i++)
    {
        scanf("%d %d", &arr[0][i], &arr[1][i]);
    }
    int dp[2][n + 1];
    for (int i = 0; i <= n; i++)
    {
        dp[0][i] = -1;
        dp[1][i] = -1;
    }
    dp[0][1] = arr[0][1]; // 기간
    dp[1][1] = arr[1][1]; // 가격

    for (int i = 2; i <= n; i++)
    {
        for (int j = 1; j < i; j++)
        {
            dp[0][j]--;
            if (dp[0][j] <= 0)
            {
                if ((dp[1][j] + arr[1][i]) > dp[1][i])
                {
                    dp[1][i] = (dp[1][j] + arr[1][i]);
                }
            }
        }
        if (dp[1][i] == -1)
            dp[1][i] = arr[1][i];
        dp[0][i] = arr[0][i];
    }

    int max = 0;
    for (int i = 0; i <= n; i++)
    {
        if (max < dp[1][i] && (dp[0][i] <= 1))
            max = dp[1][i];
    }

    printf("%d\n", max);

    return 0;
}
