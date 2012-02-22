/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.chasen.crfpp;

class CRFPPJNI {
  public final static native long Model_createTagger(long jarg1, Model jarg1_);
  public final static native String Model_what(long jarg1, Model jarg1_);
  public final static native void delete_Model(long jarg1);
  public final static native long new_Model(String jarg1);
  public final static native boolean Tagger_set_model(long jarg1, Tagger jarg1_, long jarg2, Model jarg2_);
  public final static native void Tagger_set_vlevel(long jarg1, Tagger jarg1_, long jarg2);
  public final static native long Tagger_vlevel(long jarg1, Tagger jarg1_);
  public final static native void Tagger_set_cost_factor(long jarg1, Tagger jarg1_, float jarg2);
  public final static native float Tagger_cost_factor(long jarg1, Tagger jarg1_);
  public final static native void Tagger_set_nbest(long jarg1, Tagger jarg1_, long jarg2);
  public final static native long Tagger_nbest(long jarg1, Tagger jarg1_);
  public final static native boolean Tagger_add(long jarg1, Tagger jarg1_, String jarg2);
  public final static native long Tagger_size(long jarg1, Tagger jarg1_);
  public final static native long Tagger_xsize(long jarg1, Tagger jarg1_);
  public final static native long Tagger_dsize(long jarg1, Tagger jarg1_);
  public final static native long Tagger_result(long jarg1, Tagger jarg1_, long jarg2);
  public final static native long Tagger_answer(long jarg1, Tagger jarg1_, long jarg2);
  public final static native long Tagger_y(long jarg1, Tagger jarg1_, long jarg2);
  public final static native String Tagger_y2(long jarg1, Tagger jarg1_, long jarg2);
  public final static native String Tagger_yname(long jarg1, Tagger jarg1_, long jarg2);
  public final static native String Tagger_x(long jarg1, Tagger jarg1_, long jarg2, long jarg3);
  public final static native long Tagger_ysize(long jarg1, Tagger jarg1_);
  public final static native double Tagger_prob__SWIG_0(long jarg1, Tagger jarg1_, long jarg2, long jarg3);
  public final static native double Tagger_prob__SWIG_1(long jarg1, Tagger jarg1_, long jarg2);
  public final static native double Tagger_prob__SWIG_2(long jarg1, Tagger jarg1_);
  public final static native void Tagger_set_penalty(long jarg1, Tagger jarg1_, long jarg2, long jarg3, double jarg4);
  public final static native double Tagger_penalty(long jarg1, Tagger jarg1_, long jarg2, long jarg3);
  public final static native double Tagger_alpha(long jarg1, Tagger jarg1_, long jarg2, long jarg3);
  public final static native double Tagger_beta(long jarg1, Tagger jarg1_, long jarg2, long jarg3);
  public final static native double Tagger_emission_cost(long jarg1, Tagger jarg1_, long jarg2, long jarg3);
  public final static native double Tagger_next_transition_cost(long jarg1, Tagger jarg1_, long jarg2, long jarg3, long jarg4);
  public final static native double Tagger_prev_transition_cost(long jarg1, Tagger jarg1_, long jarg2, long jarg3, long jarg4);
  public final static native double Tagger_best_cost(long jarg1, Tagger jarg1_, long jarg2, long jarg3);
  public final static native double Tagger_Z(long jarg1, Tagger jarg1_);
  public final static native boolean Tagger_parse__SWIG_0(long jarg1, Tagger jarg1_);
  public final static native boolean Tagger_empty(long jarg1, Tagger jarg1_);
  public final static native boolean Tagger_clear(long jarg1, Tagger jarg1_);
  public final static native boolean Tagger_next(long jarg1, Tagger jarg1_);
  public final static native String Tagger_parse__SWIG_1(long jarg1, Tagger jarg1_, String jarg2);
  public final static native String Tagger_what(long jarg1, Tagger jarg1_);
  public final static native void delete_Tagger(long jarg1);
  public final static native long new_Tagger(String jarg1);
  public final static native String VERSION_get();
}
