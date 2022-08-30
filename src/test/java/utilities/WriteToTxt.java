package utilities;


import pojos.Appointment;
import pojos.CTestItem;
import pojos.Registrant;
import pojos.Room;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToTxt {


    public static void saveRegistrantData(Registrant registrant) {
        try {
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("api_registrant_data"), true);

            BufferedWriter writer = new BufferedWriter(fileWriter);


            writer.append(registrant + "\n");


            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void saveRegistrantDataPost(Registrant[] registrants) {
        try {
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("api_registrant_data"), true);

            BufferedWriter writer = new BufferedWriter(fileWriter);


            writer.append(registrants + "\n");


            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void saveAppointData(Appointment appointment) {

        try {

            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("appointment_records"), true);

            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(appointment + "\n");


            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public static void saveRegistrantData(List<Object> SSNIds) {
        try {
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("database_registrant_data"), false);

            BufferedWriter writer = new BufferedWriter(fileWriter);

            for (Object eachSSN : SSNIds) {
                writer.append(eachSSN + ",\n");
            }

            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public static void saveRegistrantData(Registrant[] registrants) {
        try {
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("api_all_registrant_data"), false);

            BufferedWriter writer = new BufferedWriter(fileWriter);


            for (int i = 0; i < registrants.length; i++) {
                writer.append(registrants[i].getFirstName() + "," + registrants[i].getLastName() + "," + registrants[i].getSsn() + "," + registrants[i].getLogin() +
                        "," + registrants[i].getId() + "," + registrants[i].getEmail() + "\n");
            }

            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static boolean saveRegistrantDataUI(Registrant[] registrants) {
        try {
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("api_all_registrant_data"), false);

            BufferedWriter writer = new BufferedWriter(fileWriter);


            for (int i = 0; i < registrants.length; i++) {
                writer.append(registrants[i].getFirstName() + "," + registrants[i].getLastName() + "," + registrants[i].getSsn() + "," + registrants[i].getLogin() +
                        "," + registrants[i].getId() + "," + registrants[i].getEmail() + "\n");
            }

            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


        return false;
    }


    public static void saveAppointmentId(String fileName, List<Object> id) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));

            for (int i = 0; i < id.size(); i++)

                writer.append(id.get(i).toString() + ",\n");

            writer.close();

        } catch (IOException e) {
        }
    }

    public static void saveAppointmentStartDate(String fileName, List<Object> StartDate) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));

            for (int i = 0; i < StartDate.size(); i++)

                writer.append(StartDate.get(i).toString() + ",\n");

            writer.close();

        } catch (IOException e) {
        }
    }

    public static void saveAppointmentEndDate(String fileName, List<Object> EndDate) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));

            for (int i = 0; i < EndDate.size(); i++)

                writer.append(EndDate.get(i).toString() + ",\n");

            writer.close();

        } catch (IOException e) {
        }
    }

    public static void saveAppointmentStatus(String fileName, List<Object> Status) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));

            for (int i = 0; i < Status.size(); i++)

                writer.append(Status.get(i).toString() + ",\n");

            writer.close();

        } catch (IOException e) {
        }
    }

    public static void saveStaffId(String fileName, List<Object> idList) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));

            for (int i = 0; i < idList.size(); i++)

                writer.append(idList.get(i).toString() + ",\n");

            writer.close();

        } catch (IOException e) {
        }
    }

    public static void saveStaffFirstName(String fileName, List<Object> NameList) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));

            for (int i = 0; i < NameList.size(); i++)

                writer.append(NameList.get(i).toString() + ",\n");

            writer.close();

        } catch (IOException e) {
        }
    }

    public static void saveRoomId(String fileName, List<Object> idList) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));

            for (int i = 0; i < idList.size(); i++)

                writer.append(idList.get(i).toString() + ",\n");

            writer.close();

        } catch (IOException e) {
        }
    }
















    public static void savePhysicianId(String fileName, List<Object> idList) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));

            for (int i = 0; i < idList.size(); i++)

                writer.append(idList.get(i).toString() + ",\n");

            writer.close();

        } catch (IOException e) {
        }
    }

    public static void saveRoomData(Room roomNumber) {
        try {

            FileWriter fileWriter = new FileWriter("./src/test/resources/testdata/RoomData.txt",
                    false);

            BufferedWriter writer = new BufferedWriter(fileWriter);


            writer.append("Room " + roomNumber + "\n");

            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }























    public static void saveTestData(CTestItem test) {

        try {
            FileWriter fileWriter = new FileWriter("./src/test/resources/testdata/CTestItem.txt",
                    false);
            //src/resource/feature/testdata/RoomData


            BufferedWriter writer = new BufferedWriter(fileWriter);

            //writer.append(registrant.getFirstName() + "," + registrant.getLastName() + ","
             //              + registrant.getUsername() + "," + registrant.getEmail() + ","
                //            + registrant.getPassword() + "," + registrant.getSSN() + ", \n");


            writer.append("CTestItem " + test + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


































    public static void saveTestItemsId(String fileName, List<Object> idList) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));

            for (int i = 0; i < idList.size(); i++)

                writer.append(idList.get(i).toString() + ",\n");

            writer.close();

        } catch (IOException e) {
        }
    }


    public static void saveStaffName(String filename2, List<Object> emailList) {
    }
}
