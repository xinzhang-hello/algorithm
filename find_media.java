int findBest(int[] nums1,int[] nums2) {
	if(nums1.length > nums2.length) {
		return findBest(num2,nums2);
	}

	int i=0;
	int N = nums1.length - 1;
	int totalLen = nums1.length + nums2.length;
	while(i< N) {
			int x = i + (N - i ) / 2;
			int y = (totalLen +1 / 2)  - x ;

			int xLeft = nums1[x-1];
			int xRight = nums1[x];

			int yLeft = nums1[y-1];
			int yRight = nums1[y+1];


			if(xLeft <=yRight && xRight >= yLeft) {
				if(totalLen%2 == 0) {
					return  (Math.max(xLeft,yLeft) + Math.max(xRight,y.xRight) ) /2;

				}else {
					return Math.max(xLeft,yLeft);
				}
			}

			if(nums1[x] < num2[y]) {
				i = x +1;
			}else {
				N = y -1;
			}
	}
}
