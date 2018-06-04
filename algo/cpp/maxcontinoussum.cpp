/* This is teh solution for maximun sum possible with contigous sub arry */

#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

void maxContSum(const vector<int> &);
int main()
{
	vector<int> v = { -2, -5, 6, -2, -3, 1, 5, -6 };
	maxContSum(v);
	return 0;
}
void maxContSum(const vector<int> &v)
{
	int maxSofar = v[0];	
	int cmax = v[0];	
	int cmax_start = 0;
	int cmax_end = 0;
	int max_start = 0;
	int max_end = 0;
	int len = v.size();
	if (len == 0)
	{
		cout << "input collection is empty";
	}
	if (len > 1)
	{
		for (int i = 1; i < v.size(); i++)
		{

			if (v[i] > (v[i] + cmax))
			{
				cmax_start = i;
				cmax_end = i;
				cmax = v[i];
			}
			else
			{
				cmax_end++;
				cmax = (v[i] + cmax);
			}
			if (cmax > maxSofar)
			{
				maxSofar = cmax;
				max_start = cmax_start;
				max_end = cmax_end ;
			}		
		}
	}

	cout << "max continous sum is " << maxSofar<<endl;
	cout << "Starts at index at " << max_start << " and ends at index " << max_end<<endl;
}