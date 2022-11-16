package entity;

import entity.Announcement.Announcement;
import entity.devices.Laptop;
import entity.devices.Phon;
import entity.home.Home;
import entity.transport.Airplane;

import java.util.concurrent.Phaser;

public class Main {
    public static void main(String[] args) {

        Announcement phone=new Phon("Samsung","Food",150,"new phone","mobile",68);
        Announcement phone1=new Phon("Horor","Food",150,"new phone","mobile",68);
        Announcement laptop=new Laptop("hp","winter",1500,"new laptop","48");
        Announcement laptop1=new Laptop("aser","colors",2000,"new laptop","50");
        Announcement home=new Home("Sweet home","Lovely",1500000,"125");
        System.out.println(phone);
        System.out.println(phone1);
        System.out.println(laptop);
        System.out.println(laptop1);
        System.out.println(home);











            }


        }

