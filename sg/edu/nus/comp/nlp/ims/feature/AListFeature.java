/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.feature;

/**
 * feature type with list value.
 * @author zhongzhi
 *
 */
public abstract class AListFeature implements IFeature {
	// feature key
	protected String m_Key;
	// feature value
	protected String m_Value;

	/*
	 * (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.feature.IFeature#getKey()
	 */
	public String getKey() {
		return this.m_Key;
	}

	/*
	 * (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.feature.IFeature#getValue()
	 */
	public String getValue() {
		return this.m_Value;
	}

	/*
	 * (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.feature.IFeature#setKey(java.lang.String)
	 */
	public boolean setKey(String p_Key) {
		if (p_Key != null) {
			p_Key = p_Key.trim();
			if (!p_Key.isEmpty()) {
				this.m_Key = p_Key;
				return true;
			}
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.feature.IFeature#setValue(java.lang.String)
	 */
	public boolean setValue(String p_Value) {
		if (p_Value != null) {
			p_Value = p_Value.trim();
			if (!p_Value.isEmpty()) {
				this.m_Value = p_Value;
				return true;
			}
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	public abstract Object clone();
}
