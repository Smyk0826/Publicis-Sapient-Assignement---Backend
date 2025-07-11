package com.example.sapientsTest.model;

public class User {

//   "id": 1,
//             "firstName": "Emily",
//             "lastName": "Johnson",
//             "maidenName": "Smith",
//             "age": 28,
//             "gender": "female",
//             "email": "emily.johnson@x.dummyjson.com",
//             "phone": "+81 965-431-3024",
//             "username": "emilys",
//             "password": "emilyspass",
//             "birthDate": "1996-5-30",
//             "image": "https://dummyjson.com/icon/emilys/128",
//             "bloodGroup": "O-",
//             "height": 193.24,
//             "weight": 63.16,
//             "eyeColor": "Green",
//             "hair": {
//                 "color": "Brown",
//                 "type": "Curly"
//             },
//             "ip": "42.48.100.32",
//             "address": {
//                 "address": "626 Main Street",
//                 "city": "Phoenix",
//                 "state": "Mississippi",
//                 "stateCode": "MS",
//                 "postalCode": "29112",
//                 "coordinates": {
//                     "lat": -77.16213,
//                     "lng": -92.084824
//                 },
//                 "country": "United States"
//             },
//             "macAddress": "47:fa:41:18:ec:eb",
//             "university": "University of Wisconsin--Madison",
//             "bank": {
//                 "cardExpire": "03/26",
//                 "cardNumber": "9289760655481815",
//                 "cardType": "Elo",
//                 "currency": "CNY",
//                 "iban": "YPUXISOBI7TTHPK2BR3HAIXL"
//             },
//             "company": {
//                 "department": "Engineering",
//                 "name": "Dooley, Kozey and Cronin",
//                 "title": "Sales Manager",
//                 "address": {
//                     "address": "263 Tenth Street",
//                     "city": "San Francisco",
//                     "state": "Wisconsin",
//                     "stateCode": "WI",
//                     "postalCode": "37657",
//                     "coordinates": {
//                         "lat": 71.814525,
//                         "lng": -161.150263
//                     },
//                     "country": "United States"
//                 }
//             },
//             "ein": "977-175",
//             "ssn": "900-590-289",
//             "userAgent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36",
//             "crypto": {
//                 "coin": "Bitcoin",
//                 "wallet": "0xb9fc2fe63b2a6c003f1c324c3bfa53259162181a",
//                 "network": "Ethereum (ERC20)"
//             },
//             "role": "admin"
    private int id;
      private String firstName;
    private String lastName;
    private String maidenName;
    private int age;
    private String gender;
    private String email;   
    private String phone;
     private String username;
    private String password;
    private String birthDate;
    private String image;   
    private String bloodGroup;
    private double height;
    private double weight;
    private String eyeColor;
    private Hair hair;
    private String ip;  
    private Address address;
    private String macAddress;
    private String university;
    private Bank bank;
    private Company company;
    private String ein;
    private String ssn;
    private String userAgent;
    private Crypto crypto;
    private String role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Hair getHair() {
        return hair;
    }

    public void setHair(Hair hair) {
        this.hair = hair;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getEin() {
        return ein;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public Crypto getCrypto() {
        return crypto;
    }

    public void setCrypto(Crypto crypto) {
        this.crypto = crypto;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
  
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
   
}
