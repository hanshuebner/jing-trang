package com.thaiopensource.xml.dtd;

public class DefaultValue extends AttributeDefault {
  private String value;
  
  public DefaultValue(String value) {
    this.value = value;
  }

  public int getType() {
    return DEFAULT_VALUE;
  }

  public String getValue() {
    return value;
  }
  
  public void accept(AttributeDefaultVisitor visitor) throws Exception {
    visitor.defaultValue(value);
  }
}
