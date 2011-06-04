package com.google.code.jqwicket.api;

import java.io.Serializable;

/**
 * Interface representing anonymous javascript function.
 * 
 * @author mkalina
 * 
 */
public interface IJQFunction extends Serializable, CharSequence {

	IJQFunction withParams(CharSequence... args);

	CharSequence[] getArgs();

	CharSequence toStringBodyOnly();

	IJQStatement toStatementBodyOnly();
}
