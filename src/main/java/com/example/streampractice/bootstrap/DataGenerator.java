package com.example.streampractice.bootstrap;

import com.example.streampractice.dto.*;
import com.example.streampractice.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {

    CountryService countryService;
    DepartmentService departmentService;
    EmployeeService employeeService;
    JobHistoryService jobHistoryService;
    JobService jobService;
    LocationService locationService;
    RegionService regionService;

    public DataGenerator(CountryService countryService, DepartmentService departmentService,
                         EmployeeService employeeService, JobHistoryService jobHistoryService,
                         JobService jobService, LocationService locationService, RegionService regionService) {

        this.countryService = countryService;
        this.departmentService = departmentService;
        this.employeeService = employeeService;
        this.jobHistoryService = jobHistoryService;
        this.jobService = jobService;
        this.locationService = locationService;
        this.regionService = regionService;

    }

    @Override
    public void run(String... args) throws Exception {

        Region region1 = new Region(1L, "Europe");
        Region region2 = new Region(2L, "Americas");
        Region region3 = new Region(3L, "Asia");
        Region region4 = new Region(4L, "Middle East and Africa");

        List<Region> regionList = new ArrayList<>() {{
            add(region1);
            add(region2);
            add(region3);
            add(region4);
        }};

        regionService.createAll(regionList);

        Country country1 = new Country("IT", "Italy", 1L);
        Country country2 = new Country("JP", "Japan", 3L);
        Country country3 = new Country("US", "United States of America", 2L);
        Country country4 = new Country("CA", "Canada", 2L);
        Country country5 = new Country("CN", "China", 3L);
        Country country6 = new Country("IN", "India", 3L);
        Country country7 = new Country("AU", "Australia", 3L);
        Country country8 = new Country("ZW", "Zimbabwe", 4L);
        Country country9 = new Country("SG", "Singapore", 3L);
        Country country10 = new Country("UK", "United Kingdom", 1L);
        Country country11 = new Country("FR", "France", 1L);
        Country country12 = new Country("DE", "Germany", 1L);
        Country country13 = new Country("ZM", "Zambia", 4L);
        Country country14 = new Country("EG", "Egypt", 4L);
        Country country15 = new Country("BR", "Brazil", 2L);
        Country country16 = new Country("CH", "Switzerland", 1L);
        Country country17 = new Country("NL", "Netherlands", 1L);
        Country country18 = new Country("MX", "Mexico", 2L);
        Country country19 = new Country("KW", "Kuwait", 4L);
        Country country20 = new Country("IL", "Israel", 4L);
        Country country21 = new Country("DK", "Denmark", 1L);
        Country country22 = new Country("ML", "Malaysia", 3L);
        Country country23 = new Country("NG", "Nigeria", 4L);
        Country country24 = new Country("Ar", "Argentina", 2L);
        Country country25 = new Country("BE", "Belgium", 1L);

        List<Country> countryList = new ArrayList<>() {{
            add(country1);
            add(country2);
            add(country3);
            add(country4);
            add(country5);
            add(country6);
            add(country7);
            add(country8);
            add(country9);
            add(country10);
            add(country11);
            add(country12);
            add(country13);
            add(country14);
            add(country15);
            add(country16);
            add(country17);
            add(country18);
            add(country19);
            add(country20);
            add(country21);
            add(country22);
            add(country23);
            add(country24);
            add(country25);
        }};

        countryService.createAll(countryList);

        Location location1 = new Location(1000L, "1297 Via Cola di Rie", "00989", "Roma", null, "IT");
        Location location2 = new Location(1100L, "93091 Calle della Testa", "10934", "Venice", null, "IT");
        Location location3 = new Location(1200L, "2017 Shinjuku-ku", "1689", "Tokyo", "Tokyo Prefecture", "JP");
        Location location4 = new Location(1300L, "9450 Kamiya-cho", "6823", "Hiroshima", null, "JP");
        Location location5 = new Location(1400L, "2014 Jabberwocky Rd", "26192", "Southlake", "Texas", "US");
        Location location6 = new Location(1500L, "Interiors Blvd", "99236", "South San Francisco", "California", "US");
        Location location7 = new Location(1600L, "2007 Zagora St", "50090", "South Brunswick", "New Jersey", "US");
        Location location8 = new Location(1700L, "2004 Charade Rd", "98199", "Seattle", "Washington", "US");
        Location location9 = new Location(1800L, "147 Spadina Ave", "M5V 2L7", "Toronto", "Ontario", "CA");
        Location location10 = new Location(1900L, "6092 Boxwood St", "YSW 9T2", "Whitehorse", "Yukon", "CA");
        Location location11 = new Location(2000L, "40-5-12 Laogianggen", "190518", "Beijing", null, "CN");
        Location location12 = new Location(2100L, "1298 Vilparle (E)", "490231", "Bombay", "Maharashtra", "IN");
        Location location13 = new Location(2200L, "12-98 Victoria Street", "2901", "Sydney", "New South Wales", "AU");
        Location location14 = new Location(2300L, "198 Clementi North", "540198", "Singapore", null, "SG");
        Location location15 = new Location(2400L, "8204 Arthur St", "EC4R 9AY", "London", null, "UK");
        Location location16 = new Location(2500L, "Magdalen Centre, The Oxford Science Park", "OX9 9ZB", "Oxford", "Oxford", "UK");
        Location location17 = new Location(2600L, "9702 Chester Road", "09629850293", "Stretford", "Manchester", "UK");
        Location location18 = new Location(2700L, "Schwanthalerstr. 7031", "80925", "Munich", "Bavaria", "DE");
        Location location19 = new Location(2800L, "Rua Frei Caneca 1360", "01307-002", "Sao Paulo", "Sao Paulo", "BR");
        Location location20 = new Location(2900L, "Rue des Corps-Saints", "1730", "Geneva", "Geneve", "CH");
        Location location21 = new Location(3000L, "Murtenstrasse 921", "3095", "Bern", "BE", "CH");
        Location location22 = new Location(3100L, "Pieter Breughelstraat 837", "3029SK", "Utrecht", "Utrecht", "NL");
        Location location23 = new Location(3200L, "Mariano Escobedo 9991", "11932", "Mexico City", "Distrito Federal", "MX");

        List<Location> locationList = new ArrayList<>() {{
            add(location1);
            add(location2);
            add(location3);
            add(location4);
            add(location5);
            add(location6);
            add(location7);
            add(location8);
            add(location9);
            add(location10);
            add(location11);
            add(location12);
            add(location13);
            add(location14);
            add(location15);
            add(location16);
            add(location17);
            add(location18);
            add(location19);
            add(location20);
            add(location21);
            add(location22);
            add(location23);
        }};

        locationService.createAll(locationList);

        Department department1 = new Department(10L, "Administration", 200L, 1700L);
        Department department2 = new Department(20L, "Marketing", 201L, 1800L);
        Department department3 = new Department(30L, "Purchasing", 114L, 1700L);
        Department department4 = new Department(40L, "Human Resources", 203L, 2400L);
        Department department5 = new Department(50L, "Shipping", 121L, 1500L);
        Department department6 = new Department(60L, "IT", 103L, 1400L);
        Department department7 = new Department(70L, "Public Relations", 204L, 2700L);
        Department department8 = new Department(80L, "Sales", 145L, 2500L);
        Department department9 = new Department(90L, "Executive", 100L, 1700L);
        Department department10 = new Department(100L, "Finance", 108L, 1700L);
        Department department11 = new Department(110L, "Accounting", 205L, 1700L);
        Department department12 = new Department(120L, "Treasury", null, 1700L);
        Department department13 = new Department(130L, "Corporate Tax", null, 1700L);
        Department department14 = new Department(140L, "Control and Credit", null, 1700L);
        Department department15 = new Department(150L, "Shareholder Services", null, 1700L);
        Department department16 = new Department(160L, "Benefits", null, 1700L);
        Department department17 = new Department(170L, "Manufacturing", null, 1700L);
        Department department18 = new Department(180L, "Construction", null, 1700L);
        Department department19 = new Department(190L, "Contracting", null, 1700L);
        Department department20 = new Department(200L, "Operations", null, 1700L);
        Department department21 = new Department(210L, "IT Support", null, 1700L);
        Department department22 = new Department(220L, "NOC", null, 1700L);
        Department department23 = new Department(230L, "IT Helpdesk", null, 1700L);
        Department department24 = new Department(240L, "Government Sales", null, 1700L);
        Department department25 = new Department(250L, "Retail Sales", null, 1700L);
        Department department26 = new Department(260L, "Recruiting", null, 1700L);
        Department department27 = new Department(270L, "Payroll", null, 1700L);

        List<Department> departmentList = new ArrayList<>() {{
            add(department1);
            add(department2);
            add(department3);
            add(department4);
            add(department5);
            add(department6);
            add(department7);
            add(department8);
            add(department9);
            add(department10);
            add(department11);
            add(department12);
            add(department13);
            add(department14);
            add(department15);
            add(department16);
            add(department17);
            add(department18);
            add(department19);
            add(department20);
            add(department21);
            add(department22);
            add(department23);
            add(department24);
            add(department25);
            add(department26);
            add(department27);
        }};

        departmentService.createAll(departmentList);

        Job job1 = new Job("AD_PRES", "President", 20080L, 40000L);
        Job job2 = new Job("AD_VP", "Administration Vice President", 15000L, 30000L);
        Job job3 = new Job("AD_ASST", "Administration Assistant", 3000L, 6000L);
        Job job4 = new Job("FI_MGR", "Finance Manager", 8200L, 16000L);
        Job job5 = new Job("FI_ACCOUNT", "Accountant", 4200L, 9000L);
        Job job6 = new Job("AC_MGR", "Accounting Manager", 8200L, 16000L);
        Job job7 = new Job("AC_ACCOUNT", "Public Accountant", 4200L, 9000L);
        Job job8 = new Job("SA_MAN", "Sales Manager", 10000L, 20080L);
        Job job9 = new Job("SA_REP", "Sales Representative", 6000L, 12008L);
        Job job10 = new Job("PU_MAN", "Purchasing Manager", 8000L, 15000L);
        Job job11 = new Job("PU_CLERK", "Purchasing Clerk", 2500L, 5500L);
        Job job12 = new Job("ST_MAN", "Stock Manager", 5500L, 8500L);
        Job job13 = new Job("ST_CLERK", "Stock Clerk", 2008L, 5000L);
        Job job14 = new Job("SH_CLERK", "Shipping Clerk", 2500L, 5500L);
        Job job15 = new Job("IT_PROG", "Programmer", 4000L, 10000L);
        Job job16 = new Job("MK_MAN", "Marketing Manager", 9000L, 15000L);
        Job job17 = new Job("MK_REP", "Marketing Representative", 4000L, 9000L);
        Job job18 = new Job("HR_REP", "Human Resources Representative", 4000L, 9000L);
        Job job19 = new Job("PR_REP", "Public Relations Representative", 4500L, 10500L);

        List<Job> jobList = new ArrayList<>() {{
            add(job1);
            add(job2);
            add(job3);
            add(job4);
            add(job5);
            add(job6);
            add(job7);
            add(job8);
            add(job9);
            add(job10);
            add(job11);
            add(job12);
            add(job13);
            add(job14);
            add(job15);
            add(job16);
            add(job17);
            add(job18);
            add(job19);
        }};

        jobService.createAll(jobList);

        Employee employee1 = new Employee(100L, "Steven", "King", "SKING", "515.123.4567", LocalDate.of(2003, 6, 17), "AD_PRES", 24000L, null, null, 90L);
        Employee employee2 = new Employee(101L, "Neena", "Kochar", "NKOCHAR", "515.123.4568", LocalDate.of(2005, 9, 21), "AD_VP", 17000L, null, 100L, 90L);
        Employee employee3 = new Employee(102L, "Lex", "De Haan", "LDEHAAN", "515.123.4569", LocalDate.of(2001, 1, 13), "AD_VP", 17000L, null, 100L, 90L);
        Employee employee4 = new Employee(103L, "Alexander", "Hunold", "AHUNOLD", "590.423.4567", LocalDate.of(2006, 1, 3), "IT_PROG", 9000L, null, 102L, 60L);
        Employee employee5 = new Employee(104L, "Bruce", "Ernst", "BERNST", "590.423.4568", LocalDate.of(2007, 5, 21), "IT_PROG", 6000L, null, 103L, 60L);
        Employee employee6 = new Employee(105L, "David", "Austin", "DAUSTIN", "590.423.4569", LocalDate.of(2005, 6, 25), "IT_PROG", 4800L, null, 103L, 60L);
        Employee employee7 = new Employee(106L, "Valli", "Pataballa", "VPATABAL", "590.423.4560", LocalDate.of(2006, 2, 5), "IT_PROG", 4800L, null, 103L, 60L);
        Employee employee8 = new Employee(107L, "Diana", "Lorentz", "DLORENTZ", "590.423.5567", LocalDate.of(2007, 2, 7), "IT_PROG", 4200L, null, 103L, 60L);
        Employee employee9 = new Employee(108L, "Nancy", "Greenberg", "NGREENBE", "515.124.4569", LocalDate.of(2002, 8, 17), "FI_MGR", 12008L, null, 101L, 100L);
        Employee employee10 = new Employee(109L, "Daniel", "Faviet", "DFAVIET", "515.124.4169", LocalDate.of(2002, 8, 16), "FI_ACCOUNT", 9000L, null, 108L, 100L);
        Employee employee11 = new Employee(110L, "John", "Chen", "JCHEN", "515.124.4269", LocalDate.of(2005, 9, 28), "FI_ACCOUNT", 8200L, null, 108L, 100L);
        Employee employee12 = new Employee(111L, "Ismael", "Sciarra", "ISCIARRA", "515.124.4369", LocalDate.of(2005, 9, 30), "FI_ACCOUNT", 7700L, null, 108L, 100L);
        Employee employee13 = new Employee(112L, "Jose Manuel", "Urman", "JMURMAN", "515.124.4469", LocalDate.of(2006, 3, 7), "FI_ACCOUNT", 7800L, null, 108L, 100L);
        Employee employee14 = new Employee(113L, "Luis", "Popp", "LPOPP", "515.124.4567", LocalDate.of(2007, 12, 7), "FI_ACCOUNT", 6900L, null, 108L, 100L);
        Employee employee15 = new Employee(114L, "Den", "Raphaely", "DRAPHEAL", "515.127.4561", LocalDate.of(2002, 12, 7), "PU_MAN", 11000L, null, 100L, 30L);
        Employee employee16 = new Employee(115L, "Alexander", "Khoo", "AKHOO", "515.127.4562", LocalDate.of(2003, 5, 18), "PU_CLERK", 3100L, null, 114L, 30L);
        Employee employee17 = new Employee(116L, "Shelli", "Baida", "SBAIDA", "515.127.4563", LocalDate.of(2005, 12, 24), "PU_CLERK", 2900L, null, 114L, 30L);
        Employee employee18 = new Employee(117L, "Sigal", "Tobias", "STOBIAS", "515.127.4564", LocalDate.of(2005, 7, 24), "PU_CLERK", 2800L, null, 114L, 30L);
        Employee employee19 = new Employee(118L, "Guy", "Himuro", "GHIMURO", "515.127.4565", LocalDate.of(2006, 11, 15), "PU_CLERK", 2600L, null, 114L, 30L);
        Employee employee20 = new Employee(119L, "Karen", "Colmenares", "KCOLMENA", "515.127.4566", LocalDate.of(2007, 8, 10), "PU_CLERK", 2500L, null, 114L, 30L);
        Employee employee21 = new Employee(120L, "Matthew", "Weiss", "MWEISS", "650.123.1234", LocalDate.of(2004, 7, 18), "ST_MAN", 8000L, null, 100L, 50L);
        Employee employee22 = new Employee(121L, "Adam", "Fripp", "AFRIPP", "650.123.2234", LocalDate.of(2005, 4, 10), "ST_MAN", 8200L, null, 100L, 50L);
        Employee employee23 = new Employee(122L, "Payam", "Kaufling", "PKAUFLIN", "650.123.3234", LocalDate.of(2003, 5, 1), "ST_MAN", 7900L, null, 100L, 50L);
        Employee employee24 = new Employee(123L, "Shanta", "Vollman", "SVOLLMAN", "650.123.4234", LocalDate.of(2005, 10, 10), "ST_MAN", 6500L, null, 100L, 50L);
        Employee employee25 = new Employee(124L, "Kevin", "Mourgos", "KMOURGOS", "650.123.5234", LocalDate.of(2007, 11, 16), "ST_MAN", 5800L, null, 100L, 50L);
        Employee employee26 = new Employee(125L, "Julia", "Nayer", "JNAYER", "650.124.1214", LocalDate.of(2005, 7, 16), "ST_CLERK", 3200L, null, 120L, 50L);
        Employee employee27 = new Employee(126L, "Irene", "Mikkilineni", "IMIKKILI", "650.124.1224", LocalDate.of(2006, 9, 28), "ST_CLERK", 2700L, null, 120L, 50L);
        Employee employee28 = new Employee(127L, "James", "Landry", "JLANDRY", "650.124.1334", LocalDate.of(2007, 1, 14), "ST_CLERK", 2400L, null, 120L, 50L);
        Employee employee29 = new Employee(128L, "Steven", "Markle", "SMARKLE", "650.124.1434", LocalDate.of(2008, 3, 8), "ST_CLERK", 2200L, null, 120L, 50L);
        Employee employee30 = new Employee(129L, "Laura", "Bissot", "LBISSOT", "650.124.5234", LocalDate.of(2005, 8, 20), "ST_CLERK", 3300L, null, 121L, 50L);
        Employee employee31 = new Employee(130L, "Mozhe", "Atkinson", "MATKINSO", "650.124.6234", LocalDate.of(2005, 10, 30), "ST_CLERK", 2800L, null, 121L, 50L);
        Employee employee32 = new Employee(131L, "James", "Marlow", "JAMRLOW", "650.124.7234", LocalDate.of(2005, 2, 16), "ST_CLERK", 2500L, null, 121L, 50L);
        Employee employee33 = new Employee(132L, "TJ", "Olson", "TJOLSON", "650.124.8234", LocalDate.of(2007, 4, 10), "ST_CLERK", 2100L, null, 121L, 50L);
        Employee employee34 = new Employee(133L, "Jason", "Mallin", "JMALLIN", "650.127.1934", LocalDate.of(2004, 6, 14), "ST_CLERK", 3300L, null, 122L, 50L);
        Employee employee35 = new Employee(134L, "Michael", "Rogers", "MROGERS", "650.127.1834", LocalDate.of(2006, 8, 26), "ST_CLERK", 2900L, null, 122L, 50L);
        Employee employee36 = new Employee(135L, "Ki", "Gee", "KGEE", "650.127.1734", LocalDate.of(2007, 12, 12), "ST_CLERK", 2400L, null, 122L, 50L);
        Employee employee37 = new Employee(136L, "Hazel", "Philtanker", "HPHILTAN", "650.127.1634", LocalDate.of(2008, 2, 6), "ST_CLERK", 2200L, null, 122L, 50L);
        Employee employee38 = new Employee(137L, "Renske", "Ladwig", "RLADWIG", "650.121.1234", LocalDate.of(2003, 7, 14), "ST_CLERK", 3600L, null, 123L, 50L);
        Employee employee39 = new Employee(138L, "Stephen", "Stiles", "SSTILES", "650.121.2034", LocalDate.of(2005, 10, 26), "ST_CLERK", 3200L, null, 123L, 50L);
        Employee employee40 = new Employee(139L, "John", "Seo", "JSEO", "650.121.2019", LocalDate.of(2006, 2, 12), "ST_CLERK", 2700L, null, 123L, 50L);
        Employee employee41 = new Employee(140L, "Joshua", "Patel", "JPATEL", "650.121.1834", LocalDate.of(2006, 4, 6), "ST_CLERK", 2500L, null, 123L, 50L);
        Employee employee42 = new Employee(141L, "Trenna", "Rajs", "TRAJS", "650.121.8009", LocalDate.of(2003, 10, 17), "ST_CLERK", 3500L, null, 124L, 50L);
        Employee employee43 = new Employee(142L, "Curtis", "Davies", "CDAVIES", "650.121.2994", LocalDate.of(2005, 1, 29), "ST_CLERK", 3100L, null, 124L, 50L);
        Employee employee44 = new Employee(143L, "Randall", "Matos", "RMATOS", "650.121.2874", LocalDate.of(2006, 3, 15), "ST_CLERK", 2600L, null, 124L, 50L);
        Employee employee45 = new Employee(144L, "Peter", "Vargas", "PVARGAS", "650.121.2004", LocalDate.of(2006, 9, 7), "ST_CLERK", 2500L, null, 124L, 50L);
        Employee employee46 = new Employee(145L, "John", "Russel", "JRUSSEL", "011.44.1344.429268", LocalDate.of(2004, 1, 10), "SA_MAN", 14000L, 4D, 100L, 80L);
        Employee employee47 = new Employee(146L, "Karen", "Partners", "KPARTNER", "011.44.1344.467268", LocalDate.of(2005, 1, 5), "SA_MAN", 13500L, 3D, 100L, 80L);
        Employee employee48 = new Employee(147L, "Alberto", "Errazuriz", "AERRAZUR", "011.44.1344.429278", LocalDate.of(2005, 3, 10), "SA_MAN", 12000L, 3D, 100L, 80L);
        Employee employee49 = new Employee(148L, "Gerald", "Cambrault", "GCAMBRAU", "011.44.1344.619268", LocalDate.of(2007, 10, 15), "SA_MAN", 11000L, 3D, 100L, 80L);
        Employee employee50 = new Employee(149L, "Eleni", "Zlotkey", "EZLOTKEY", "011.44.1344.429018", LocalDate.of(2008, 1, 29), "SA_MAN", 10500L, 2D, 100L, 80L);
        Employee employee51 = new Employee(150L, "Peter", "Tucker", "PTUCKER", "011.44.1344.129268", LocalDate.of(2005, 1, 30), "SA_REP", 10000L, 3D, 145L, 80L);
        Employee employee52 = new Employee(151L, "David", "Bernstein", "DBERNSTE", "011.44.1344.345268", LocalDate.of(2005, 3, 24), "SA_REP", 9500L, 25D, 145L, 80L);
        Employee employee53 = new Employee(152L, "Peter", "Hall", "PHALL", "011.44.1344.478968", LocalDate.of(2005, 8, 20), "SA_REP", 9000L, 25D, 145L, 80L);
        Employee employee54 = new Employee(153L, "Christopher", "Olsen", "COLSEN", "011.44.1344.498718", LocalDate.of(2006, 3, 30), "SA_REP", 8000L, 2D, 145L, 80L);
        Employee employee55 = new Employee(154L, "Nanette", "Cambrault", "NCAMBRAU", "011.44.1344.987668", LocalDate.of(2006, 12, 9), "SA_REP", 7500L, 2D, 145L, 80L);
        Employee employee56 = new Employee(155L, "Oliver", "Tuvault", "OTUVAULT", "011.44.1344.486508", LocalDate.of(2007, 11, 23), "SA_REP", 7000L, 15D, 145L, 80L);
        Employee employee57 = new Employee(156L, "Janette", "King", "JKING", "011.44.1345.429268", LocalDate.of(2004, 1, 30), "SA_REP", 10000L, 35D, 146L, 80L);
        Employee employee58 = new Employee(157L, "Patrick", "Sully", "PSULLY", "011.44.1345.929268", LocalDate.of(2004, 3, 4), "SA_REP", 9500L, 35D, 146L, 80L);
        Employee employee59 = new Employee(158L, "Allan", "McEwen", "AMCEWEN", "011.44.1345.829268", LocalDate.of(2004, 8, 1), "SA_REP", 9000L, 35D, 146L, 80L);
        Employee employee60 = new Employee(159L, "Lindsey", "Smith", "LSMITH", "011.44.1345.729268", LocalDate.of(2005, 3, 10), "SA_REP", 8000L, 3D, 146L, 80L);
        Employee employee61 = new Employee(160L, "Louise", "Doran", "LDORAN", "011.44.1345.629268", LocalDate.of(2005, 12, 15), "SA_REP", 7500L, 3D, 146L, 80L);
        Employee employee62 = new Employee(161L, "Sarath", "Sewall", "SSEWALL", "011.44.1345.529268", LocalDate.of(2006, 11, 3), "SA_REP", 7000L, 25D, 146L, 80L);
        Employee employee63 = new Employee(162L, "Clara", "Vishney", "CVISHNEY", "011.44.1346.129268", LocalDate.of(2005, 11, 11), "SA_REP", 10500L, 25D, 147L, 80L);
        Employee employee64 = new Employee(163L, "Danielle", "Greene", "DGREENE", "011.44.1346.229268", LocalDate.of(2007, 3, 19), "SA_REP", 9500L, 15D, 147L, 80L);
        Employee employee65 = new Employee(164L, "Mattea", "Marvins", "MMARVINS", "011.44.1346.329268", LocalDate.of(2008, 1, 24), "SA_REP", 7200L, 10D, 147L, 80L);
        Employee employee66 = new Employee(165L, "David", "Lee", "DLEE", "011.44.1346.529268", LocalDate.of(2008, 2, 23), "SA_REP", 6800L, 1D, 147L, 80L);
        Employee employee67 = new Employee(166L, "Sundar", "Ande", "SANDE", "011.44.1346.629268", LocalDate.of(2008, 3, 24), "SA_REP", 6400L, 10D, 147L, 80L);
        Employee employee68 = new Employee(167L, "Amit", "Banda", "ABANDA", "011.44.1346.729268", LocalDate.of(2008, 4, 21), "SA_REP", 6200L, 10D, 147L, 80L);
        Employee employee69 = new Employee(168L, "Lisa", "Ozer", "LOZER", "011.44.1343.929268", LocalDate.of(2005, 3, 11), "SA_REP", 11500L, 25D, 148L, 80L);
        Employee employee70 = new Employee(169L, "Harrison", "Bloom", "HBLOOM", "011.44.1343.829268", LocalDate.of(2006, 3, 23), "SA_REP", 10000L, 20D, 148L, 80L);
        Employee employee71 = new Employee(170L, "Tayler", "Fox", "TFOX", "011.44.1343.729268", LocalDate.of(2006, 1, 24), "SA_REP", 9600L, 20D, 148L, 80L);
        Employee employee72 = new Employee(171L, "William", "Smith", "WSMITH", "011.44.1343.629268", LocalDate.of(2007, 2, 23), "SA_REP", 7400L, 15D, 148L, 80L);
        Employee employee73 = new Employee(172L, "Elizabeth", "Bates", "EBATES", "011.44.1343.529268", LocalDate.of(2007, 3, 24), "SA_REP", 7300L, 15D, 148L, 80L);
        Employee employee74 = new Employee(173L, "Sundita", "Kumar", "SKUMAR", "011.44.1343.329268", LocalDate.of(2008, 4, 21), "SA_REP", 6100L, 10D, 148L, 80L);
        Employee employee75 = new Employee(174L, "Ellen", "Abel", "EABEL", "011.44.1644.429267", LocalDate.of(2004, 5, 11), "SA_REP", 11000L, 30D, 149L, 80L);
        Employee employee76 = new Employee(175L, "Alyssa", "Hutton", "AHUTTON", "011.44.1644.429266", LocalDate.of(2005, 3, 19), "SA_REP", 8800L, 25D, 149L, 80L);
        Employee employee77 = new Employee(176L, "Jonathon", "Taylor", "JTAYLOR", "011.44.1644.429265", LocalDate.of(2006, 3, 24), "SA_REP", 8600L, 20D, 149L, 80L);
        Employee employee78 = new Employee(177L, "Jack", "Livingston", "JLIVINGS", "011.44.1644.429264", LocalDate.of(2006, 4, 23), "SA_REP", 8400L, 20D, 149L, 80L);
        Employee employee79 = new Employee(178L, "Kimberely", "Grant", "KGRANT", "011.44.1644.429263", LocalDate.of(2007, 5, 24), "SA_REP", 7000L, 15D, 149L, 80L);
        Employee employee80 = new Employee(179L, "Charles", "Johnson", "CJOHNSON", "011.44.1644.429262", LocalDate.of(2008, 1, 4), "SA_REP", 6200L, 10D, 149L, 80L);
        Employee employee81 = new Employee(180L, "Winston", "Taylor", "WTAYLOR", "650.507.9876", LocalDate.of(2006, 1, 24), "SH_CLERK", 3200L, null, 120L, 50L);
        Employee employee82 = new Employee(181L, "Jean", "Fleaur", "JFLEAUR", "650.507.9877", LocalDate.of(2006, 2, 23), "SH_CLERK", 3100L, null, 120L, 50L);
        Employee employee83 = new Employee(182L, "Martha", "Sullivan", "MSULLIVA", "650.507.9878", LocalDate.of(2007, 6, 21), "SH_CLERK", 2500L, null, 120L, 50L);
        Employee employee84 = new Employee(183L, "Girard", "Geoni", "GGEONI", "650.507.9879", LocalDate.of(2008, 2, 3), "SH_CLERK", 2800L, null, 120L, 50L);
        Employee employee85 = new Employee(184L, "Nandita", "Sarchand", "NSARCHAN", "650.509.1876", LocalDate.of(2004, 1, 27), "SH_CLERK", 4200L, null, 121L, 50L);
        Employee employee86 = new Employee(185L, "Alexis", "Bull", "ABULL", "650.509.2876", LocalDate.of(2005, 2, 20), "SH_CLERK", 4100L, null, 121L, 50L);
        Employee employee87 = new Employee(186L, "Julia", "Dellinger", "JDELLING", "650.509.3876", LocalDate.of(2006, 6, 24), "SH_CLERK", 3400L, null, 121L, 50L);
        Employee employee88 = new Employee(187L, "Anthony", "Cabrio", "ACABRIO", "650.509.4876", LocalDate.of(2007, 2, 7), "SH_CLERK", 3000L, null, 121L, 50L);
        Employee employee89 = new Employee(188L, "Kelly", "Chung", "KCHUNG", "650.505.1876", LocalDate.of(2005, 6, 14), "SH_CLERK", 3800L, null, 122L, 50L);
        Employee employee90 = new Employee(189L, "Jennifer", "Dilly", "JDILLY", "650.505.2876", LocalDate.of(2005, 8, 13), "SH_CLERK", 3600L, null, 122L, 50L);
        Employee employee91 = new Employee(190L, "Timothy", "Gates", "TGATES", "650.505.3876", LocalDate.of(2006, 7, 11), "SH_CLERK", 2900L, null, 122L, 50L);
        Employee employee92 = new Employee(191L, "Randall", "Perkins", "RPERKINS", "650.505.4876", LocalDate.of(2007, 12, 19), "SH_CLERK", 2500L, null, 122L, 50L);
        Employee employee93 = new Employee(192L, "Sarah", "Bell", "SBELL", "650.501.1876", LocalDate.of(2004, 2, 4), "SH_CLERK", 4000L, null, 123L, 50L);
        Employee employee94 = new Employee(193L, "Britney", "Everett", "BEVERETT", "650.501.2876", LocalDate.of(2005, 3, 3), "SH_CLERK", 3900L, null, 123L, 50L);
        Employee employee95 = new Employee(194L, "Samuel", "McCain", "SMCCAIN", "650.501.3876", LocalDate.of(2006, 7, 1), "SH_CLERK", 3200L, null, 123L, 50L);
        Employee employee96 = new Employee(195L, "Vance", "Jones", "VJONES", "650.501.4876", LocalDate.of(2007, 3, 17), "SH_CLERK", 2800L, null, 123L, 50L);
        Employee employee97 = new Employee(196L, "Alana", "Walsh", "AWALSH", "650.507.9811", LocalDate.of(2006, 4, 24), "SH_CLERK", 3100L, null, 124L, 50L);
        Employee employee98 = new Employee(197L, "Kevin", "Feeney", "KFEENEY", "650.507.9822", LocalDate.of(2006, 5, 23), "SH_CLERK", 3000L, null, 124L, 50L);
        Employee employee99 = new Employee(198L, "Donald", "OConnell", "DOCONNEL", "650.507.9833", LocalDate.of(2007, 6, 21), "SH_CLERK", 2600L, null, 124L, 50L);
        Employee employee100 = new Employee(199L, "Douglas", "Grant", "DGRANT", "650.507.9844", LocalDate.of(2008, 1, 13), "SH_CLERK", 2600L, null, 124L, 50L);
        Employee employee101 = new Employee(200L, "Jennifer", "Whalen", "JWHALEN", "515.123.4444", LocalDate.of(2003, 9, 17), "AD_ASST", 4400L, null, 101L, 10L);
        Employee employee102 = new Employee(201L, "Michael", "Hartstein", "MHARTSTE", "515.123.5555", LocalDate.of(2004, 2, 17), "MK_MAN", 13000L, null, 100L, 20L);
        Employee employee103 = new Employee(202L, "Pat", "Fay", "PFAY", "603.123.6666", LocalDate.of(2005, 8, 17), "MK_REP", 6000L, null, 201L, 20L);
        Employee employee104 = new Employee(203L, "Susan", "Mavris", "SMAVRIS", "515.123.7777", LocalDate.of(2002, 6, 7), "HR_REP", 6500L, null, 101L, 40L);
        Employee employee105 = new Employee(204L, "Hermann", "Baer", "HBAER", "515.123.8888", LocalDate.of(2002, 6, 7), "PR_REP", 10000L, null, 101L, 70L);
        Employee employee106 = new Employee(205L, "Shelley", "Higgins", "SHIGGINS", "515.123.8080", LocalDate.of(2002, 6, 7), "AC_MGR", 12008L, null, 101L, 110L);
        Employee employee107 = new Employee(206L, "William", "Gietz", "WGIETZ", "515.123.8080", LocalDate.of(2002, 6, 7), "AC_ACCOUNT", 8300L, null, 205L, 110L);

        List<Employee> employeeList = new ArrayList<>() {{
            add(employee1);
            add(employee2);
            add(employee3);
            add(employee4);
            add(employee5);
            add(employee6);
            add(employee7);
            add(employee8);
            add(employee9);
            add(employee10);
            add(employee11);
            add(employee12);
            add(employee13);
            add(employee14);
            add(employee15);
            add(employee16);
            add(employee17);
            add(employee18);
            add(employee19);
            add(employee20);
            add(employee21);
            add(employee22);
            add(employee23);
            add(employee24);
            add(employee25);
            add(employee26);
            add(employee27);
            add(employee28);
            add(employee29);
            add(employee30);
            add(employee31);
            add(employee32);
            add(employee33);
            add(employee34);
            add(employee35);
            add(employee36);
            add(employee37);
            add(employee38);
            add(employee39);
            add(employee40);
            add(employee41);
            add(employee42);
            add(employee43);
            add(employee44);
            add(employee45);
            add(employee46);
            add(employee47);
            add(employee48);
            add(employee49);
            add(employee50);
            add(employee51);
            add(employee52);
            add(employee53);
            add(employee54);
            add(employee55);
            add(employee56);
            add(employee57);
            add(employee58);
            add(employee59);
            add(employee60);
            add(employee61);
            add(employee62);
            add(employee63);
            add(employee64);
            add(employee65);
            add(employee66);
            add(employee67);
            add(employee68);
            add(employee69);
            add(employee70);
            add(employee71);
            add(employee72);
            add(employee73);
            add(employee74);
            add(employee75);
            add(employee76);
            add(employee77);
            add(employee78);
            add(employee79);
            add(employee80);
            add(employee81);
            add(employee82);
            add(employee83);
            add(employee84);
            add(employee85);
            add(employee86);
            add(employee87);
            add(employee88);
            add(employee89);
            add(employee90);
            add(employee91);
            add(employee92);
            add(employee93);
            add(employee94);
            add(employee95);
            add(employee96);
            add(employee97);
            add(employee98);
            add(employee99);
            add(employee100);
            add(employee101);
            add(employee102);
            add(employee103);
            add(employee104);
            add(employee105);
            add(employee106);
            add(employee107);
        }};

        employeeService.createAll(employeeList);

        JobHistory jobHistory1 = new JobHistory(102L, LocalDate.of(2001, 1, 13), LocalDate.of(2006, 7, 24), "IT_PROG", 60L);
        JobHistory jobHistory2 = new JobHistory(101L, LocalDate.of(1997, 9, 21), LocalDate.of(2001, 10, 27), "AC_ACCOUNT", 110L);
        JobHistory jobHistory3 = new JobHistory(101L, LocalDate.of(2001, 10, 28), LocalDate.of(2005, 3, 15), "AC_MGR", 110L);
        JobHistory jobHistory4 = new JobHistory(201L, LocalDate.of(2004, 2, 17), LocalDate.of(2007, 12, 19), "MK_REP", 20L);
        JobHistory jobHistory5 = new JobHistory(114L, LocalDate.of(2006, 3, 24), LocalDate.of(2007, 12, 31), "ST_CLERK", 50L);
        JobHistory jobHistory6 = new JobHistory(122L, LocalDate.of(2007, 1, 1), LocalDate.of(2007, 12, 31), "ST_CLERK", 50L);
        JobHistory jobHistory7 = new JobHistory(200L, LocalDate.of(1995, 9, 17), LocalDate.of(2001, 6, 17), "AD_ASST", 90L);
        JobHistory jobHistory8 = new JobHistory(176L, LocalDate.of(2006, 3, 24), LocalDate.of(2006, 12, 31), "SA_REP", 80L);
        JobHistory jobHistory9 = new JobHistory(176L, LocalDate.of(2007, 1, 1), LocalDate.of(2007, 12, 31), "SA_MAN", 80L);
        JobHistory jobHistory10 = new JobHistory(200L, LocalDate.of(2002, 7, 1), LocalDate.of(2006, 12, 31), "AC_ACCOUNT", 90L);

        List<JobHistory> jobHistoryList = new ArrayList<>() {{
            add(jobHistory1);
            add(jobHistory2);
            add(jobHistory3);
            add(jobHistory4);
            add(jobHistory5);
            add(jobHistory6);
            add(jobHistory7);
            add(jobHistory8);
            add(jobHistory9);
            add(jobHistory10);
        }};

        jobHistoryService.createAll(jobHistoryList);

    }

}