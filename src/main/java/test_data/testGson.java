package test_data;

import com.google.gson.Gson;

public class testGson {

    public static void main(String[] args) {
//            testGson();
            testBuilderMethod();
    }

        private static void testGson(){
            String TestJsonString = "{\n" +
                    "  \"processor\": \"2.5GHZ\",\n" +
                    "  \"ram\": \"4GB\",\n" +
                    "  \"osType\":\"MacOs\",\n" +
                    "  \"hdd\": \"512GB\",\n" +
                    "  \"software\": \"photoshop\"\n" +
                    "}";
            Gson gson = new Gson();

            //From Json String to object
            ComputerData computerData = gson.fromJson(TestJsonString, ComputerData.class);
            System.out.println(computerData);

            //From object to JsonString
            System.out.println(gson.toJson(computerData));
        }

        private static void testBuilderMethod() {
            String relatedDataFileLocation = "/src/main/java/test_data/data.json";
            ComputerData computerData = DataObjectBuilder.builderDataObjectFrom(relatedDataFileLocation,ComputerData.class);
//            System.out.println(computerData);
            System.out.println(computerData.getProcessor());;
            System.out.println(computerData.getRam());;
            System.out.println(computerData.getOsType());;
            System.out.println(computerData.getHdd());;
        }
    }

