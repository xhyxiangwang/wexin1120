package com.tencent.mm.plugin.ipcall.ui;

import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ay.d;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.List;

public final class f
  extends BaseAdapter
{
  private List<a> fIU;
  private String ilM;
  private List<a> ncG;
  private IPCallCountryCodeSelectUI ncH;
  int[] ncI;
  boolean ncJ;
  boolean ncK;
  
  public f(IPCallCountryCodeSelectUI paramIPCallCountryCodeSelectUI, List<a> paramList)
  {
    GMTrace.i(11693451116544L, 87123);
    this.ncG = new ArrayList();
    this.ncJ = false;
    this.ncK = false;
    this.ncH = paramIPCallCountryCodeSelectUI;
    this.fIU = paramList;
    aIg();
    aIh();
    GMTrace.o(11693451116544L, 87123);
  }
  
  private void aIg()
  {
    GMTrace.i(11693585334272L, 87124);
    int i = 0;
    int j = this.fIU.size();
    while (i < j)
    {
      this.ncG.add(this.fIU.get(i));
      i += 1;
    }
    this.ncH.ncy.setVisibility(8);
    GMTrace.o(11693585334272L, 87124);
  }
  
  private void aIh()
  {
    GMTrace.i(11693719552000L, 87125);
    this.ncI = new int[this.fIU.size()];
    int j = this.fIU.size();
    int i = 0;
    while (i < j)
    {
      this.ncI[i] = ((a)this.fIU.get(i)).aHW();
      i += 1;
    }
    GMTrace.o(11693719552000L, 87125);
  }
  
  private static String pj(int paramInt)
  {
    GMTrace.i(11694524858368L, 87131);
    char c = (char)paramInt;
    String[] arrayOfString = IPCallCountryCodeScrollbar.ncN;
    int j = arrayOfString.length;
    int i = 0;
    while (i < j)
    {
      if (arrayOfString[i].equals(String.valueOf((char)paramInt)))
      {
        GMTrace.o(11694524858368L, 87131);
        return String.valueOf(c);
      }
      i += 1;
    }
    GMTrace.o(11694524858368L, 87131);
    return "#";
  }
  
  public final int getCount()
  {
    GMTrace.i(11693853769728L, 87126);
    int i = this.fIU.size();
    GMTrace.o(11693853769728L, 87126);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(11693987987456L, 87127);
    Object localObject = this.fIU.get(paramInt);
    GMTrace.o(11693987987456L, 87127);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(11694122205184L, 87128);
    long l = paramInt;
    GMTrace.o(11694122205184L, 87128);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(11694390640640L, 87130);
    Object localObject = (a)getItem(paramInt);
    int i;
    if (paramView == null)
    {
      paramView = View.inflate(this.ncH, R.i.cXN, null);
      paramViewGroup = new a();
      paramViewGroup.ncL = ((TextView)paramView.findViewById(R.h.byM));
      paramViewGroup.kjm = ((TextView)paramView.findViewById(R.h.byO));
      paramViewGroup.ncM = ((TextView)paramView.findViewById(R.h.byR));
      paramView.setTag(paramViewGroup);
      if (paramInt <= 0) {
        break label244;
      }
      i = this.ncI[(paramInt - 1)];
      label103:
      if (paramInt != 0) {
        break label269;
      }
      paramViewGroup.ncL.setVisibility(0);
      if (!this.ncK) {
        break label250;
      }
      paramViewGroup.ncL.setText(R.l.euX);
      label132:
      if (bg.mZ(this.ilM)) {
        break label323;
      }
      Spannable localSpannable = d.a(((a)localObject).hDL, this.ilM);
      paramViewGroup.kjm.setText(localSpannable);
      localObject = d.a(" (+" + ((a)localObject).countryCode + ")", this.ilM);
      paramViewGroup.ncM.setText((CharSequence)localObject);
      label208:
      if (!this.ncJ) {
        break label370;
      }
      paramViewGroup.ncM.setVisibility(0);
    }
    for (;;)
    {
      GMTrace.o(11694390640640L, 87130);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label244:
      i = -1;
      break label103;
      label250:
      paramViewGroup.ncL.setText(pj(this.ncI[paramInt]));
      break label132;
      label269:
      if ((paramInt > 0) && (this.ncI[paramInt] != i))
      {
        paramViewGroup.ncL.setVisibility(0);
        paramViewGroup.ncL.setText(pj(this.ncI[paramInt]));
        break label132;
      }
      paramViewGroup.ncL.setVisibility(8);
      break label132;
      label323:
      paramViewGroup.kjm.setText(((a)localObject).hDL);
      paramViewGroup.ncM.setText(" (+" + ((a)localObject).countryCode + ")");
      break label208;
      label370:
      paramViewGroup.ncM.setVisibility(4);
    }
  }
  
  public final void zP(String paramString)
  {
    GMTrace.i(11694256422912L, 87129);
    if (paramString != null)
    {
      this.ilM = paramString.trim();
      this.fIU.clear();
      int j = this.ncG.size();
      int i = 0;
      while (i < j)
      {
        if ((((a)this.ncG.get(i)).hDL.toUpperCase().contains(this.ilM.toUpperCase())) || (((a)this.ncG.get(i)).naB.toUpperCase().contains(this.ilM.toUpperCase())) || (((a)this.ncG.get(i)).countryCode.contains(this.ilM))) {
          this.fIU.add(this.ncG.get(i));
        }
        i += 1;
      }
      aIh();
      if (this.fIU.size() != 0) {
        break label203;
      }
      this.ncH.ncy.setVisibility(0);
    }
    for (;;)
    {
      super.notifyDataSetChanged();
      GMTrace.o(11694256422912L, 87129);
      return;
      label203:
      this.ncH.ncy.setVisibility(8);
    }
  }
  
  static final class a
  {
    TextView kjm;
    TextView ncL;
    TextView ncM;
    
    a()
    {
      GMTrace.i(11705262276608L, 87211);
      GMTrace.o(11705262276608L, 87211);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */