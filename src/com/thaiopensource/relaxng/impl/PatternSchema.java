package com.thaiopensource.relaxng.impl;

import com.thaiopensource.util.PropertyMap;
import com.thaiopensource.validate.Schema;
import com.thaiopensource.validate.ValidateProperty;
import com.thaiopensource.validate.Validator;
import org.xml.sax.ErrorHandler;

public class PatternSchema implements Schema {
  private final SchemaPatternBuilder spb;
  private final Pattern start;

  public PatternSchema(SchemaPatternBuilder spb, Pattern start) {
    this.spb = spb;
    this.start = start;
  }

  public Validator createValidator(PropertyMap properties) {
    ErrorHandler eh = ValidateProperty.ERROR_HANDLER.get(properties);
    return new PatternValidator(start, new ValidatorPatternBuilder(spb), eh);
  }
}
