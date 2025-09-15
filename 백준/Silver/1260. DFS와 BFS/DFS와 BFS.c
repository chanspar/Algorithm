#define _CRT_NO_SECURE_WARNINGS
#include <stdio.h>
#include <string.h>

int stack[1001];
int stack1[1001];
int visited[1001]; 
int cnt = 1, cnt1 = 1;

void dfs(int arr[1001][1001], int start, int n)
{
    visited[start] = 1;
    stack[cnt++] = start;

    for (int j = 1; j <= n; j++)
    {
        if (arr[start][j] == 1 && !visited[j])
        {
            arr[start][j] = 0;
            arr[j][start] = 0;
            dfs(arr, j, n);
        }
    }
}

void bfs(int arr[1001][1001], int start, int n)
{
    int front = 0, rear = 0;
    int queue[1001]; 
    memset(visited, 0, sizeof(visited));

    visited[start] = 1;
    stack1[cnt1++] = start;
    queue[rear++] = start;

    while (front < rear)
    {
        int current = queue[front++];
        for (int j = 1; j <= n; j++)
        {
            if (arr[current][j] == 1 && !visited[j])
            {
                visited[j] = 1;
                arr[current][j] = 0;
                arr[j][current] = 0;
                stack1[cnt1++] = j;
                queue[rear++] = j;
            }
        }
    }
}

int main()
{
    int n, m, start;
    int a, b;
    int arr[1001][1001];
    int arr1[1001][1001];

    scanf("%d %d %d", &n, &m, &start);
    stack[0] = start;
    stack1[0] = start;

    memset(arr, 0, sizeof(arr));
    memset(arr1, 0, sizeof(arr1));

    for (int i = 1; i <= m; i++)
    {
        scanf("%d %d", &a, &b);
        arr[a][b] = 1;
        arr[b][a] = 1;
        arr1[a][b] = 1;
        arr1[b][a] = 1;
    }

    dfs(arr, start, n);
    bfs(arr1, start, n);

    for (int i = 1; i < cnt; i++)
    {
        printf("%d\n", stack[i]);
    }

    for (int i = 1; i < cnt1; i++)
    {
        printf("%d\n", stack1[i]);
    }

    return 0;
}
