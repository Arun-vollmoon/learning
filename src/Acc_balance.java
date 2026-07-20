import java.sql.*;

class Acc_balance {

    private static  int A_no = 55; // fixed account, no creation needed

    public double getBalance() {
        double balance = 0;
        try (Connection con = mysql_connection.getConnection();
             PreparedStatement ps = con.prepareStatement(
                     "select balance from account where account_no=?")) {

            ps.setInt(1, A_no);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    balance = rs.getDouble("balance");
                }
            }
        } catch (Exception e) {
            System.out.println("The Error:" + e);
        }
        return balance;
    }

    public void setBalance(double newBalance) {
        try (Connection con = mysql_connection.getConnection();
             PreparedStatement ps = con.prepareStatement(
                     "update account set balance=? where account_no=?")) {

            ps.setDouble(1, newBalance);
            ps.setInt(2, A_no);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("The Error:" + e);
        }
    }
}