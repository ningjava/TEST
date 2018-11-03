package TEST;

public class LogicalOperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 短路||
		int i0 = 0;
		int j0 = 0;
		if (++i0 > 0 || ++j0 > 0) {
			System.out.println("短路|| i0的值:" + i0);
			System.out.println("短路|| j0的值:" + j0);
		}
		// 短路&&
		int i1 = 0;
		int j1 = 0;
		if (!(++i1 < 0 && ++j1 > 0)) {
			System.out.println("短路&& i1的值:" + i1);
			System.out.println("短路&& j1的值:" + j1);
		}
		// 非短路|，每个部分都参加运算
		int i2 = 0;
		int j2 = 0;
		if (++i2 > 0 | ++j2 > 0) {
			System.out.println("非短路| i2的值:" + i2);
			System.out.println("非短路| j2的值:" + j2);
		}
		// 非短路&，每个部分都参加运算
		int i3 = 0;
		int j3 = 0;
		if (!(++i3 < 0 & ++j3 > 0)) {
			System.out.println("非短路& i3的值:" + i3);
			System.out.println("非短路& j3的值:" + j3);
		}
	}

}
