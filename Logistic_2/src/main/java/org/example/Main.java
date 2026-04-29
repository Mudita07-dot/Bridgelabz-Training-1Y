package org.example;
import java.sql.*;

public class Main {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/logistics";
        String user = "root";
        String pwd = "Mudita@2005";

        try {
            Class.forName("org.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, pwd);

            // ✅ Create Driver
            Driver driver = new Driver("D1204", "Kavita Nair");

            // ✅ Save Driver to DB
            insertDriver(con, driver);

            // ✅ Load Route from DB
            RouteLinkedList<Checkpoint> route = driver.getRouteHistory();

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM checkpoints");

            while (rs.next()) {

                String id = rs.getString("id");
                String name = rs.getString("name");
                String type = rs.getString("type");
                double distance = rs.getDouble("distance");
                double time = rs.getDouble("time");
                double extra = rs.getDouble("extra");

                Checkpoint cp;

                switch (type.toLowerCase()) {
                    case "delivery":
                        cp = new DeliveryCheckpoint(id, name, distance, time, extra);
                        break;
                    case "fuel":
                        cp = new FuelCheckpoint(id, name, distance, time, extra);
                        break;
                    case "rest":
                        cp = new RestCheckpoint(id, name, distance, time, extra);
                        break;
                    default:
                        continue;
                }

                route.addCheckpoint(cp);
            }

            // ✅ Print Final Output
            driver.printRouteSummary();

            con.close();

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }

    // ================= DRIVER INSERT =================
    public static void insertDriver(Connection con, Driver driver) throws SQLException {

        String sql = "INSERT INTO drivers (driver_id, name) VALUES (?, ?)";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, driver.getDriverId());
        ps.setString(2, driver.getName());

        ps.executeUpdate();

        System.out.println("✅ Driver saved in database");
    }
}

