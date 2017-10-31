package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.signin.e;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class h
{
  public final Account afD;
  public final Set<Scope> agY;
  private final int agZ;
  private final View aha;
  public final String ahb;
  final String ahc;
  final Set<Scope> akT;
  public final Map<a<?>, a> akU;
  public final e akV;
  public Integer akW;
  
  public h(Account paramAccount, Set<Scope> paramSet, Map<a<?>, a> paramMap, int paramInt, View paramView, String paramString1, String paramString2, e parame)
  {
    this.afD = paramAccount;
    if (paramSet == null) {}
    for (paramAccount = Collections.EMPTY_SET;; paramAccount = Collections.unmodifiableSet(paramSet))
    {
      this.agY = paramAccount;
      paramAccount = paramMap;
      if (paramMap == null) {
        paramAccount = Collections.EMPTY_MAP;
      }
      this.akU = paramAccount;
      this.aha = paramView;
      this.agZ = paramInt;
      this.ahb = paramString1;
      this.ahc = paramString2;
      this.akV = parame;
      paramAccount = new HashSet(this.agY);
      paramSet = this.akU.values().iterator();
      while (paramSet.hasNext()) {
        paramAccount.addAll(((a)paramSet.next()).ahs);
      }
    }
    this.akT = Collections.unmodifiableSet(paramAccount);
  }
  
  public static final class a
  {
    public final Set<Scope> ahs;
    public final boolean akX;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/common/internal/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */