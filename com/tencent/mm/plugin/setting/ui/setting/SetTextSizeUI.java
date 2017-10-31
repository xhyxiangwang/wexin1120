package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bq.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;

public class SetTextSizeUI
  extends MMPreference
{
  private f ilZ;
  private float pqu;
  private int pqv;
  
  public SetTextSizeUI()
  {
    GMTrace.i(4599775756288L, 34271);
    this.pqv = 1;
    GMTrace.o(4599775756288L, 34271);
  }
  
  public static float ai(float paramFloat)
  {
    GMTrace.i(4600581062656L, 34277);
    if (paramFloat == 0.875F)
    {
      GMTrace.o(4600581062656L, 34277);
      return 14.0F;
    }
    if (paramFloat == 1.0F)
    {
      GMTrace.o(4600581062656L, 34277);
      return 16.0F;
    }
    if (paramFloat == 1.125F)
    {
      GMTrace.o(4600581062656L, 34277);
      return 18.0F;
    }
    if (paramFloat == 1.25F)
    {
      GMTrace.o(4600581062656L, 34277);
      return 20.0F;
    }
    if (paramFloat == 1.375F)
    {
      GMTrace.o(4600581062656L, 34277);
      return 22.0F;
    }
    if (paramFloat == 1.625F)
    {
      GMTrace.o(4600581062656L, 34277);
      return 26.0F;
    }
    if (paramFloat == 1.875F)
    {
      GMTrace.o(4600581062656L, 34277);
      return 28.0F;
    }
    if (paramFloat == 2.025F)
    {
      GMTrace.o(4600581062656L, 34277);
      return 30.0F;
    }
    GMTrace.o(4600581062656L, 34277);
    return 16.0F;
  }
  
  public static float dc(Context paramContext)
  {
    float f1 = 1.0F;
    GMTrace.i(4600312627200L, 34275);
    float f2 = a.dZ(paramContext);
    if ((f2 != 1.0F) && (f2 != 0.875F) && (f2 != 1.125F) && (f2 != 1.25F) && (f2 != 1.375F) && (f2 != 1.625F) && (f2 != 1.875F) && (f2 != 2.025F)) {}
    for (;;)
    {
      GMTrace.o(4600312627200L, 34275);
      return f1;
      f1 = f2;
    }
  }
  
  public static int dd(Context paramContext)
  {
    GMTrace.i(4600446844928L, 34276);
    float f = dc(paramContext);
    if (f == 0.875F)
    {
      i = R.l.eGf;
      GMTrace.o(4600446844928L, 34276);
      return i;
    }
    if (f == 1.125F)
    {
      i = R.l.eGd;
      GMTrace.o(4600446844928L, 34276);
      return i;
    }
    if (f == 1.25F)
    {
      i = R.l.eGg;
      GMTrace.o(4600446844928L, 34276);
      return i;
    }
    if (f == 1.375F)
    {
      i = R.l.eGc;
      GMTrace.o(4600446844928L, 34276);
      return i;
    }
    int i = R.l.eGe;
    GMTrace.o(4600446844928L, 34276);
    return i;
  }
  
  private void refresh()
  {
    GMTrace.i(4600983715840L, 34280);
    this.ilZ.removeAll();
    Object localObject = new a(this, 0.875F);
    ((Preference)localObject).setKey("setting_text_size_small");
    ((Preference)localObject).setLayoutResource(R.i.dap);
    if (this.pqu == 0.875F)
    {
      ((Preference)localObject).setWidgetLayoutResource(R.i.daV);
      this.ilZ.a((Preference)localObject);
      localObject = new a(this, 1.0F);
      ((Preference)localObject).setKey("setting_text_size_normal");
      ((Preference)localObject).setLayoutResource(R.i.dap);
      if (this.pqu != 1.0F) {
        break label383;
      }
      ((Preference)localObject).setWidgetLayoutResource(R.i.daV);
      label109:
      this.ilZ.a((Preference)localObject);
      localObject = new a(this, 1.125F);
      ((Preference)localObject).setKey("setting_text_size_large");
      ((Preference)localObject).setLayoutResource(R.i.dap);
      if (this.pqu != 1.125F) {
        break label393;
      }
      ((Preference)localObject).setWidgetLayoutResource(R.i.daV);
      label161:
      this.ilZ.a((Preference)localObject);
      localObject = new a(this, 1.25F);
      ((Preference)localObject).setKey("setting_text_size_super");
      ((Preference)localObject).setLayoutResource(R.i.dap);
      if (this.pqu != 1.25F) {
        break label403;
      }
      ((Preference)localObject).setWidgetLayoutResource(R.i.daV);
      label213:
      this.ilZ.a((Preference)localObject);
      localObject = new a(this, 1.375F);
      ((Preference)localObject).setKey("setting_text_size_huge");
      ((Preference)localObject).setLayoutResource(R.i.dap);
      if (this.pqu != 1.375F) {
        break label413;
      }
      ((Preference)localObject).setWidgetLayoutResource(R.i.daV);
    }
    for (;;)
    {
      this.ilZ.a((Preference)localObject);
      localObject = new PreferenceCategory(this);
      this.ilZ.a((Preference)localObject);
      this.ilZ.notifyDataSetChanged();
      localObject = (ViewGroup)this.vov.voD;
      int i = 0;
      int j = ((ViewGroup)localObject).getChildCount();
      while (i < j)
      {
        View localView = ((ViewGroup)localObject).getChildAt(i);
        if ((localView instanceof TextView)) {
          w.d("ui.settings.SetTextSize", "id=" + localView.getId());
        }
        i += 1;
      }
      ((Preference)localObject).setWidgetLayoutResource(R.i.daW);
      break;
      label383:
      ((Preference)localObject).setWidgetLayoutResource(R.i.daW);
      break label109;
      label393:
      ((Preference)localObject).setWidgetLayoutResource(R.i.daW);
      break label161;
      label403:
      ((Preference)localObject).setWidgetLayoutResource(R.i.daW);
      break label213;
      label413:
      ((Preference)localObject).setWidgetLayoutResource(R.i.daW);
    }
    GMTrace.o(4600983715840L, 34280);
  }
  
  protected final void MH()
  {
    GMTrace.i(4600178409472L, 34274);
    this.pqu = dc(this);
    this.ilZ = this.vOv;
    oC(R.l.eIX);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4686480408576L, 34917);
        SetTextSizeUI.this.aKl();
        SetTextSizeUI.this.finish();
        GMTrace.o(4686480408576L, 34917);
        return true;
      }
    });
    a(0, getString(R.l.eHn), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4618163585024L, 34408);
        a.e(SetTextSizeUI.this, SetTextSizeUI.a(SetTextSizeUI.this));
        SetTextSizeUI.this.finish();
        GMTrace.o(4618163585024L, 34408);
        return true;
      }
    }, p.b.vpB);
    refresh();
    GMTrace.o(4600178409472L, 34274);
  }
  
  public final int QD()
  {
    GMTrace.i(4599909974016L, 34272);
    GMTrace.o(4599909974016L, 34272);
    return -1;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(4600849498112L, 34279);
    paramf = paramPreference.iay;
    this.pqv = 1;
    if (paramf.equals("setting_text_size_small"))
    {
      this.pqu = 0.875F;
      this.pqv = 0;
    }
    for (;;)
    {
      refresh();
      GMTrace.o(4600849498112L, 34279);
      return false;
      if (paramf.equals("setting_text_size_normal"))
      {
        this.pqu = 1.0F;
        this.pqv = 1;
      }
      else if (paramf.equals("setting_text_size_large"))
      {
        this.pqu = 1.125F;
        this.pqv = 2;
      }
      else if (paramf.equals("setting_text_size_super"))
      {
        this.pqu = 1.25F;
        this.pqv = 3;
      }
      else if (paramf.equals("setting_text_size_huge"))
      {
        this.pqu = 1.375F;
        this.pqv = 4;
      }
      else if (paramf.equals("setting_text_size_huger"))
      {
        this.pqu = 1.625F;
        this.pqv = 5;
      }
      else if (paramf.equals("setting_text_size_hugers"))
      {
        this.pqu = 1.625F;
        this.pqv = 6;
      }
      else if (paramf.equals("setting_text_size_hugerss"))
      {
        this.pqu = 1.625F;
        this.pqv = 7;
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4600044191744L, 34273);
    super.onCreate(paramBundle);
    MH();
    GMTrace.o(4600044191744L, 34273);
  }
  
  private final class a
    extends Preference
  {
    private float pqu;
    
    public a(Context paramContext, float paramFloat)
    {
      super();
      GMTrace.i(4652389105664L, 34663);
      this.pqu = paramFloat;
      GMTrace.o(4652389105664L, 34663);
    }
    
    protected final void onBindView(View paramView)
    {
      GMTrace.i(4652523323392L, 34664);
      super.onBindView(paramView);
      paramView = (TextView)paramView.findViewById(16908310);
      if (paramView != null) {
        paramView.setTextSize(1, SetTextSizeUI.ai(this.pqu));
      }
      GMTrace.o(4652523323392L, 34664);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SetTextSizeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */