#include <iostream>
#include <stdio.h>
#include <vector>
#include <string>
#include <stdlib.h>
using namespace std;

int	islandPerimeter(vector<vector<int>>& grid);

int main(){
	vector<vector<int>> vec;
	int arr1[] = {1,1,0,1};
	int arr2[] = {0,1,1,1};
	int arr3[] = {0,1,0,0};
	int arr4[] = {0,1,0,0};
	int size = sizeof(arr1)/sizeof(int);
	vector<int> vec1(arr1,arr1+size);
	vector<int> vec2(arr2,arr2+size);
	vector<int> vec3(arr3,arr3+size);
	vector<int> vec4(arr4,arr4+size);
	vec.push_back(vec1);
	vec.push_back(vec2);
	vec.push_back(vec3);
	vec.push_back(vec4);
	cout<<"Perimeter"<<islandPerimeter(vec)<<endl;
	system("PAUSE");
	return 0;
}


int islandPerimeter(vector<vector<int>>& grid) {
	int	r = grid.size();
	int c = grid[0].size();
	int n=0,s=0,b=0;//n:总的land个数；s，上下相交的个数;b，每一行的陆地块数
	for (int i = 0; i < r; i++)
	{
		for (int j = 0; j < c; j++)
		{
			n+=grid[i][j];
			if(i>0){
				s+=(grid[i][j]&grid[i-1][j]);
			}
			if((grid[i][j]==1&&j+1==c)||grid[i][j]==1&&(grid[i][j]&grid[i][j+1])==0)
				b++;
		}
	}
	return 2*(n-s+b);
}