package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.akv;
import java.util.List;
import org.a.d.i;

public abstract interface z
{
  public abstract void D(Bundle paramBundle);
  
  public abstract void E(Bundle paramBundle);
  
  public abstract boolean a(int paramInt1, int paramInt2, i parami, String paramString1, List<String> paramList1, akv paramakv, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5);
  
  public abstract boolean a(int paramInt, Intent paramIntent);
  
  public abstract boolean blb();
  
  public abstract View blc();
  
  public abstract boolean bld();
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */