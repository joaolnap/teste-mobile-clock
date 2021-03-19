package pageObjects;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ClockPage {

	
	 public ClockPage(AppiumDriver<?> driver) {
		 	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	@AndroidFindBy(id ="com.google.android.deskclock:id/tab_menu_alarm")
	private MobileElement botaoAlarme;

	@AndroidFindBy(id = "com.google.android.deskclock:id/fab")
	private MobileElement botaoAdd;

	@AndroidFindBy(id = "android:id/button1")
	private MobileElement botaoOk;

	@AndroidFindBy(id = "com.google.android.deskclock:id/edit_label")
	private MobileElement campoLabel;

	@AndroidFindBy(id = "com.google.android.deskclock:id/label_input_field")
	private MobileElement campoEditText;

	@AndroidFindBy(id = "com.google.android.deskclock:id/choose_ringtone")
	private MobileElement textoCombo;

	@AndroidFindBy(id ="com.google.android.deskclock:id/ringtone_primary_text")
	private MobileElement opcaoCombo;

	@AndroidFindBy(xpath = "//android.widget.Switch[@text='ON'][1]")
	private MobileElement switchApp;

	@AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Repeat']")
	private MobileElement check;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@text=[contest-desc = Expand alarm]][3]")
	private MobileElement expandApp ;
	
	@AndroidFindBy(id ="com.google.android.deskclock:id/delete")
	private MobileElement deleteAlarm;
	
	
	
	public void acessarMenuAlarme() throws Exception {
		System.out.println("acessando menu alarme");
		botaoAlarme.click();
	}
	
	public void excluirAlarme() throws Exception {
		System.out.println("Excluir alarme");
		deleteAlarm.click();
		
	}

	public void acionarBotaoNovoAlarme() throws Exception {
		System.out.println("adicionando novo alarme");
		botaoAdd.click();

	}

	public void acionarBotaoOK() throws Exception {
		botaoOk.click();
	}

	public void interagirComEditText() throws Exception {

		acessarMenuAlarme();
		acionarBotaoNovoAlarme();

		System.out.println("interagindo com o edit text");
		campoLabel.click();

		campoEditText.sendKeys("novo alarme");

	}

	public void interagirComCombo() throws Exception {

		acessarMenuAlarme();
		acionarBotaoNovoAlarme();

		System.out.println("interagindo com o combo");
		textoCombo.click();
		opcaoCombo.click();
	}

	public void interagindoComSwitch() throws Exception {
		System.out.println("interagindo com o switch");

		acessarMenuAlarme();
		acionarBotaoNovoAlarme();

		switchApp.click();

		assertEquals("false", switchApp.getAttribute("checked"));

	}

	public void interagindoComCheckBox() throws Exception {

		acessarMenuAlarme();
		acionarBotaoNovoAlarme();

		check.click();

		assertEquals("true", check.getAttribute("checked"));

	}

	public void clicarNaHora(String hora) throws Exception {

		MobileElement clickHora = (MobileElement) driver.findElement(MobileBy.AccessibilityId(hora));
		clickHora.click();

	}

	public void clicarNoMinuto(String minuto) throws InterruptedException {

		MobileElement clickMinuto = (MobileElement) driver.findElement(MobileBy.AccessibilityId(minuto));
		clickMinuto.click();
	}

	public void selecionarOPeriodo(String periodo) throws InterruptedException {
		String periodoModificado = periodo.toLowerCase();

		MobileElement clickPeriodo = (MobileElement) driver
				.findElement(MobileBy.id("android:id/" + periodoModificado + "_label"));
		clickPeriodo.click();

	}
	
	public void validarInformacoes(List<String> dados) {
		
		MobileElement infos;
		
		for (String info : dados) {
			
			infos = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='"+info+"']"));
			System.out.println("Infos Tela: " + infos.getText());
			assertEquals(info, infos.getText());
			
		}
		
	}
	

}
