package com.tencent.mm.plugin.appbrand.compat.a;

import android.content.Intent;
import android.text.Spannable;
import com.tencent.mm.kernel.c.a;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public abstract interface i
  extends a
{
  public abstract int KD();
  
  public abstract String Kn();
  
  public abstract Intent Kp();
  
  public abstract Map<String, String> Ue();
  
  public abstract Spannable a(CharSequence paramCharSequence, List<String> paramList, String paramString);
  
  public abstract Spannable a(CharSequence paramCharSequence, List<String> paramList, boolean paramBoolean, String paramString);
  
  public abstract boolean aO(String paramString1, String paramString2);
  
  public abstract String n(Map<String, String> paramMap);
  
  public abstract Properties n(File paramFile);
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/compat/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */