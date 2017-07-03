/**
 * 
 */
package br.com.extremefit.core;

import java.util.Locale;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

/**
 * @author leonardo.pinho
 *
 */
public interface Currencies {

	public static final CurrencyUnit REAL = Monetary.getCurrency("BRL");
	public static final CurrencyUnit EURO = Monetary.getCurrency("EUR");
	public static final CurrencyUnit USD = Monetary.getCurrency(Locale.US);
	public static final CurrencyUnit PESO = Monetary.getCurrency("ARS");
}
