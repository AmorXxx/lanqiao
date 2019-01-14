package zt7th;

public class JavaB6_·½¸ñÌîÊı {
	static int count = 0;

	public static void main(String[] args) {
		int[] array = { -3, -3, -3, -3, -3, -3, -3, -3, -3, -3 };
		for (int a = 0; a <= 9; a++) {
			array[0] = a;
			for (int b = 0; b <= 9; b++) {
				array[1] = b;
				if (array[1] == array[0] || array[1] + 1 == array[0] || array[1] - 1 == array[0])
					continue;
				for (int c = 0; c <= 9; c++) {
					array[2] = c;
					if (array[2] == array[1] || array[2] == array[0] || array[2] + 1 == array[1]
							|| array[2] - 1 == array[1])
						continue;
					for (int d = 0; d <= 9; d++) {
						array[3] = d;
						if (array[3] == array[0] || array[3] == array[1] || array[3] == array[2]
								|| array[3] + 1 == array[0] || array[3] - 1 == array[0])
							continue;
						for (int e = 0; e <= 9; e++) {
							array[4] = e;
							if (array[4] == array[0] || array[4] == array[1] || array[4] == array[2]
									|| array[4] == array[3] || array[4] + 1 == array[0] || array[4] - 1 == array[0]
									|| array[4] + 1 == array[1] || array[4] - 1 == array[1] || array[4] + 1 == array[3]
									|| array[4] - 1 == array[3])
								continue;
							for (int f = 0; f <= 9; f++) {
								array[5] = f;
								if (array[5] == array[0] || array[5] == array[1] || array[5] == array[2]
										|| array[5] == array[3] || array[5] == array[4] || array[5] + 1 == array[0]
										|| array[5] - 1 == array[0] || array[5] + 1 == array[1]
										|| array[5] - 1 == array[1] || array[5] + 1 == array[2]
										|| array[5] - 1 == array[2] || array[5] + 1 == array[4]
										|| array[5] - 1 == array[4])
									continue;
								for (int g = 0; g <= 9; g++) {
									array[6] = g;
									if (array[6] == array[0] || array[6] == array[1] || array[6] == array[2]
											|| array[6] == array[3] || array[6] == array[4] || array[6] == array[5]
											|| array[6] + 1 == array[1] || array[6] - 1 == array[1]
											|| array[6] + 1 == array[2] || array[6] - 1 == array[2]
											|| array[6] + 1 == array[5] || array[6] - 1 == array[5])
										continue;
									for (int h = 0; h <= 9; h++) {
										array[7] = h;
										if (array[7] == array[0] || array[7] == array[1] || array[7] == array[2]
												|| array[7] == array[3] || array[7] == array[4] || array[7] == array[5]
												|| array[7] == array[6] || array[7] - 1 == array[3]
												|| array[7] + 1 == array[3] || array[7] + 1 == array[4]
												|| array[7] - 1 == array[4])
											continue;
										for (int i = 0; i <= 9; i++) {
											array[8] = i;
											if (array[8] == array[0] || array[8] == array[1] || array[8] == array[2]
													|| array[8] == array[3] || array[8] == array[4]
													|| array[8] == array[5] || array[8] == array[6]
													|| array[8] == array[7] || array[8] + 1 == array[3]
													|| array[8] - 1 == array[3] || array[8] + 1 == array[4]
													|| array[8] - 1 == array[4] || array[8] + 1 == array[5]
													|| array[8] - 1 == array[5] || array[8] + 1 == array[7]
													|| array[8] - 1 == array[7])
												continue;
											for (int j = 0; j <= 9; j++) {
												array[9] = j;
												if (array[9] == array[0] || array[9] == array[1] || array[9] == array[2]
														|| array[9] == array[3] || array[9] == array[4]
														|| array[9] == array[5] || array[9] == array[6]
														|| array[9] == array[7] || array[9] == array[8]
														|| array[9] + 1 == array[4] || array[9] - 1 == array[4]
														|| array[9] + 1 == array[5] || array[9] - 1 == array[5]
														|| array[9] + 1 == array[6] || array[9] - 1 == array[6]
														|| array[9] + 1 == array[8] || array[9] - 1 == array[8])
													continue;
												count++;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}
