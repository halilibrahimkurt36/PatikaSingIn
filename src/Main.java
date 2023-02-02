import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String userName,password,newPassword;
		String userSingName="Halil",userSingPassword="2015";
		String choose=null;
		try (Scanner giris = new Scanner(System.in)) {
			System.out.print("Kullanıcı Adı : ");
			userName=giris.next();
			System.out.print("Password : ");
			password=giris.next();
			if(userName.equals(userSingName)) {
					if(password.equals(userSingPassword)) {
				System.out.println("Giriş Başarılı Bir Şekilde Yapıldı");
				
			}
					else {
						System.out.println("Şifre Hatalıdır!!!");
						System.out.print("Şifrenizi Sıfırlamak İstermisiniz? Y / N ");
						choose=giris.next();
						switch(choose) {
						case "Y":
							System.out.print("Lütfen Yeni Şifre Giriniz : ");
							newPassword=giris.next();
							if(newPassword.equals(password)) {
								System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
							}
							else {
								password=newPassword;
								System.out.println("Şifre Oluşturuldu");
							}
							break;
						case "N":
							System.out.println("Şifreyi Sıfırlamak istemediniz!!!");
							break;
						}
					}
			}
			
				else {
					System.out.println("Kullanıcı Adı Hatalıdır!!!");
				}
		}
		
		}
	}
	


