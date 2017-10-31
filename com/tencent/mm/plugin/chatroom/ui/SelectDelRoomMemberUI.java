package com.tencent.mm.plugin.chatroom.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Display;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ae.m;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.a.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.q;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.base.MaskLayout.a;
import com.tencent.mm.ui.contact.s;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.x.aa;
import com.tencent.mm.x.ag.a;
import com.tencent.mm.x.ag.c;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import com.tencent.mm.x.j;
import com.tencent.mm.x.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SelectDelRoomMemberUI
  extends MMActivity
{
  private ListView EA;
  private boolean fFn;
  public HashSet<String> iiR;
  private boolean kCM;
  private q kDf;
  private String kEG;
  private int kEH;
  private String kEI;
  private boolean kEJ;
  private String kEr;
  private int kGC;
  private a kGD;
  private EditText kGE;
  private String kGj;
  private String kGk;
  private String kGm;
  private String username;
  
  public SelectDelRoomMemberUI()
  {
    GMTrace.i(9153783267328L, 68201);
    GMTrace.o(9153783267328L, 68201);
  }
  
  private void Qa()
  {
    GMTrace.i(9154454355968L, 68206);
    if ((s.er(this.kGC, 64)) && (this.iiR.size() > 0))
    {
      aE(1, getString(R.l.dPR) + "(" + this.iiR.size() + ")");
      W(1, true);
      GMTrace.o(9154454355968L, 68206);
      return;
    }
    aE(1, getString(R.l.dPR));
    W(1, false);
    GMTrace.o(9154454355968L, 68206);
  }
  
  protected final void MH()
  {
    GMTrace.i(9154051702784L, 68203);
    super.MH();
    this.kEr = getIntent().getStringExtra("RoomInfo_Id");
    this.kGk = getIntent().getStringExtra("Chatroom_member_list");
    this.fFn = getIntent().getBooleanExtra("Is_Chatroom", true);
    this.kCM = getIntent().getBooleanExtra("Is_Lbsroom", false);
    this.kEJ = getIntent().getBooleanExtra("Is_RoomOwner", false);
    this.kEI = getIntent().getStringExtra("room_owner_name");
    ap.AS();
    this.kDf = c.yU().gm(this.kEr);
    this.kEH = getIntent().getIntExtra("room_member_count", 0);
    this.kGC = getIntent().getIntExtra("list_attr", s.wwz);
    this.kEG = getIntent().getStringExtra("room_name");
    rV(getString(R.l.eBR) + "(" + this.kEH + ")");
    a(1, getString(R.l.dPR), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9108954546176L, 67867);
        com.tencent.mm.ui.base.h.a(SelectDelRoomMemberUI.this, SelectDelRoomMemberUI.this.getString(R.l.eAQ), "", new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(9078621339648L, 67641);
            paramAnonymous2DialogInterface = new Intent();
            paramAnonymous2DialogInterface.putExtra("Select_Contact", bg.c(SelectDelRoomMemberUI.a(SelectDelRoomMemberUI.this), ","));
            SelectDelRoomMemberUI.this.setResult(-1, paramAnonymous2DialogInterface);
            SelectDelRoomMemberUI.this.finish();
            GMTrace.o(9078621339648L, 67641);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(9110699376640L, 67880);
            GMTrace.o(9110699376640L, 67880);
          }
        });
        GMTrace.o(9108954546176L, 67867);
        return false;
      }
    }, p.b.vpC);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9088419233792L, 67714);
        SelectDelRoomMemberUI.this.finish();
        GMTrace.o(9088419233792L, 67714);
        return false;
      }
    });
    this.kGE = ((EditText)findViewById(R.h.cer));
    this.kGE.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(9146132856832L, 68144);
        GMTrace.o(9146132856832L, 68144);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(9145998639104L, 68143);
        GMTrace.o(9145998639104L, 68143);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(9145864421376L, 68142);
        SelectDelRoomMemberUI.a locala = SelectDelRoomMemberUI.b(SelectDelRoomMemberUI.this);
        paramAnonymousCharSequence = paramAnonymousCharSequence.toString();
        locala.kGt = paramAnonymousCharSequence;
        ArrayList localArrayList = new ArrayList();
        if (!bg.mZ(paramAnonymousCharSequence))
        {
          Iterator localIterator = SelectDelRoomMemberUI.a.kGw.iterator();
          while (localIterator.hasNext())
          {
            x localx = (x)localIterator.next();
            if (localx != null) {
              if ((localx.field_conRemark != null) && (localx.field_conRemark.toUpperCase().contains(paramAnonymousCharSequence.toUpperCase())))
              {
                localArrayList.add(localx);
              }
              else if ((!bg.mZ(SelectDelRoomMemberUI.b(locala.kDf, localx.field_username))) && (SelectDelRoomMemberUI.b(locala.kDf, localx.field_username).contains(paramAnonymousCharSequence)))
              {
                localArrayList.add(localx);
              }
              else if ((localx.vp() != null) && (localx.vp().toUpperCase().contains(paramAnonymousCharSequence.toUpperCase())))
              {
                localArrayList.add(localx);
              }
              else if ((localx.qW() != null) && (localx.qW().toUpperCase().contains(paramAnonymousCharSequence.toUpperCase())))
              {
                localArrayList.add(localx);
              }
              else if ((localx.qV() != null) && (localx.qV().contains(paramAnonymousCharSequence)))
              {
                localArrayList.add(localx);
              }
              else if ((localx.field_username != null) && (localx.field_username.contains(paramAnonymousCharSequence)))
              {
                localArrayList.add(localx);
              }
              else if (!com.tencent.mm.l.a.eE(localx.field_type))
              {
                ap.AS();
                bb localbb = c.yM().BV(localx.field_username);
                if ((localbb != null) && (localbb.field_conRemark != null) && (localbb.field_conRemark.toUpperCase().contains(paramAnonymousCharSequence.toUpperCase()))) {
                  localArrayList.add(localx);
                }
              }
            }
          }
          w.i("MicroMsg.SelectDelRoomMemberUI", "--->setMemberListBySearch:search");
        }
        for (SelectDelRoomMemberUI.a.fGw = localArrayList;; SelectDelRoomMemberUI.a.fGw = SelectDelRoomMemberUI.a.kGw)
        {
          locala.notifyDataSetChanged();
          GMTrace.o(9145864421376L, 68142);
          return;
        }
      }
    });
    this.EA = ((ListView)findViewById(R.h.brV));
    new x();
    q localq = this.kDf;
    String str = this.kEr;
    Object localObject = new LinkedList();
    if (!bg.mZ(this.kGj)) {
      localObject = bg.f(this.kGj.split(","));
    }
    ap.AS();
    ay localay = c.yT().BU("@t.qq.com");
    if (localay != null) {
      ((List)localObject).add(localay.name);
    }
    this.kGD = new a(this, localq, str, (List)localObject, this.kEI);
    this.EA.setAdapter(this.kGD);
    this.EA.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(9083453177856L, 67677);
        SelectDelRoomMemberUI.b(SelectDelRoomMemberUI.this);
        paramAnonymousAdapterView = SelectDelRoomMemberUI.a.lU(paramAnonymousInt);
        if (paramAnonymousAdapterView == null)
        {
          GMTrace.o(9083453177856L, 67677);
          return;
        }
        SelectDelRoomMemberUI.a(SelectDelRoomMemberUI.this, paramAnonymousAdapterView.field_username);
        paramAnonymousView = paramAnonymousAdapterView.field_nickname;
        String str = SelectDelRoomMemberUI.b(SelectDelRoomMemberUI.c(SelectDelRoomMemberUI.this), SelectDelRoomMemberUI.d(SelectDelRoomMemberUI.this));
        if (bg.mZ(str)) {
          SelectDelRoomMemberUI.b(SelectDelRoomMemberUI.this, paramAnonymousAdapterView.vq());
        }
        for (;;)
        {
          SelectDelRoomMemberUI.a(SelectDelRoomMemberUI.this, SelectDelRoomMemberUI.d(SelectDelRoomMemberUI.this), SelectDelRoomMemberUI.e(SelectDelRoomMemberUI.this), paramAnonymousView);
          GMTrace.o(9083453177856L, 67677);
          return;
          SelectDelRoomMemberUI.b(SelectDelRoomMemberUI.this, str);
        }
      }
    });
    Qa();
    GMTrace.o(9154051702784L, 68203);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9153917485056L, 68202);
    int i = R.i.cRK;
    GMTrace.o(9153917485056L, 68202);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9154185920512L, 68204);
    super.onCreate(paramBundle);
    this.iiR = new HashSet();
    MH();
    GMTrace.o(9154185920512L, 68204);
  }
  
  public void onResume()
  {
    GMTrace.i(9154320138240L, 68205);
    super.onResume();
    if (this.kGD != null)
    {
      ap.AS();
      this.kDf = c.yU().gm(this.kEr);
      List localList = j.eS(this.kEr);
      if (this.kGD != null) {
        this.kGD.ah(localList);
      }
    }
    GMTrace.o(9154320138240L, 68205);
  }
  
  private static final class a
    extends BaseAdapter
  {
    static List<x> fGw;
    static List<x> kGw;
    private List<String> jLn;
    private String kDa;
    q kDf;
    private c kFM;
    a kGH;
    String kGt;
    private String kGv;
    private Context mContext;
    
    static
    {
      GMTrace.i(9105062232064L, 67838);
      fGw = new ArrayList();
      GMTrace.o(9105062232064L, 67838);
    }
    
    public a(Context paramContext, q paramq, String paramString1, List<String> paramList, String paramString2)
    {
      GMTrace.i(9103988490240L, 67830);
      this.kGH = null;
      this.kGv = null;
      this.kDf = paramq;
      this.kDa = paramString1;
      this.jLn = paramList;
      this.mContext = paramContext;
      this.kGv = paramString2;
      this.kFM = ap.AS();
      ah(j.eS(paramString1));
      GMTrace.o(9103988490240L, 67830);
    }
    
    public static x lU(int paramInt)
    {
      GMTrace.i(9104256925696L, 67832);
      x localx = (x)fGw.get(paramInt);
      GMTrace.o(9104256925696L, 67832);
      return localx;
    }
    
    public final void ah(List<String> paramList)
    {
      GMTrace.i(9104122707968L, 67831);
      if (paramList == null)
      {
        GMTrace.o(9104122707968L, 67831);
        return;
      }
      fGw.clear();
      int i = 0;
      if (i < paramList.size())
      {
        x localx = c.yL().SL((String)paramList.get(i));
        if ((localx != null) && (localx.field_username.equals(this.kGv))) {
          fGw.add(0, localx);
        }
        for (;;)
        {
          i += 1;
          break;
          fGw.add(localx);
        }
      }
      kGw = fGw;
      notifyDataSetChanged();
      GMTrace.o(9104122707968L, 67831);
    }
    
    public final int getCount()
    {
      GMTrace.i(9104525361152L, 67834);
      int i = fGw.size();
      GMTrace.o(9104525361152L, 67834);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(9104659578880L, 67835);
      long l = paramInt;
      GMTrace.o(9104659578880L, 67835);
      return l;
    }
    
    public final View getView(int paramInt, final View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(9104391143424L, 67833);
      Object localObject = (x)fGw.get(paramInt);
      View localView;
      if (paramView == null)
      {
        localView = View.inflate(this.mContext, R.i.cRJ, null);
        this.kGH = new a();
        this.kGH.kGJ = ((MaskLayout)localView.findViewById(R.h.cul));
        this.kGH.kjm = ((TextView)localView.findViewById(R.h.cun));
        paramView = (WindowManager)this.mContext.getSystemService("window");
        this.kGH.kjm.setMaxWidth(paramView.getDefaultDisplay().getWidth() * 2 / 3);
        this.kGH.kGK = ((TextView)localView.findViewById(R.h.cum));
        this.kGH.kGK.setMaxWidth(paramView.getDefaultDisplay().getWidth() * 2 / 3);
        this.kGH.kGL = ((ImageView)localView.findViewById(R.h.crU));
        this.kGH.kGM = ((ImageButton)localView.findViewById(R.h.bnN));
        localView.setTag(this.kGH);
      }
      while (localObject == null)
      {
        GMTrace.o(9104391143424L, 67833);
        return localView;
        this.kGH = ((a)paramView.getTag());
        localView = paramView;
      }
      paramView = this.kGH.kjm;
      paramViewGroup = this.mContext;
      label389:
      String str;
      if (!o.fW(((af)localObject).field_username))
      {
        paramInt = R.e.aPt;
        paramView.setTextColor(com.tencent.mm.bq.a.T(paramViewGroup, paramInt));
        if (!this.kDf.field_roomowner.equals(((af)localObject).field_username)) {
          break label644;
        }
        this.kGH.kGM.setVisibility(8);
        ((LargeTouchableAreasItemView)localView).kEk = null;
        a.b.a((ImageView)this.kGH.kGJ.view, ((af)localObject).field_username);
        if (((af)localObject).field_verifyFlag == 0) {
          break label749;
        }
        if (ag.a.hft == null) {
          break label736;
        }
        paramView = ag.a.hft.fh(((af)localObject).field_verifyFlag);
        if (paramView == null) {
          break label723;
        }
        paramView = m.iI(paramView);
        this.kGH.kGJ.d(paramView, MaskLayout.a.vKr);
        str = SelectDelRoomMemberUI.b(this.kDf, ((af)localObject).field_username);
        if (bg.mZ(((af)localObject).field_conRemark)) {
          break label762;
        }
        paramView = ((af)localObject).field_conRemark;
        label420:
        paramViewGroup = paramView;
        if (bg.mZ(paramView)) {
          paramViewGroup = ((x)localObject).vp();
        }
        paramView = paramViewGroup;
        if (str != null)
        {
          paramView = paramViewGroup;
          if (!str.equals(""))
          {
            paramView = paramViewGroup;
            if (!paramViewGroup.equals(str)) {
              paramView = str + "( " + paramViewGroup + " )";
            }
          }
        }
        if (com.tencent.mm.l.a.eE(((af)localObject).field_type)) {
          break label768;
        }
        ap.AS();
        localObject = c.yM().BV(((af)localObject).field_username);
        if (localObject == null) {
          break label793;
        }
        str = ((bb)localObject).field_conDescription;
        paramViewGroup = str;
        if (!bg.mZ(((bb)localObject).field_conRemark))
        {
          paramView = ((bb)localObject).field_conRemark;
          paramViewGroup = str;
        }
      }
      for (;;)
      {
        label563:
        if (!bg.mZ(paramViewGroup)) {
          this.kGH.kGK.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.mContext, paramViewGroup, this.kGH.kGK.getTextSize()));
        }
        for (;;)
        {
          this.kGH.kjm.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.mContext, paramView, this.kGH.kjm.getTextSize()));
          GMTrace.o(9104391143424L, 67833);
          return localView;
          paramInt = R.e.aPu;
          break;
          label644:
          if (((SelectDelRoomMemberUI)this.mContext).iiR.contains(((af)localObject).field_username)) {
            ((LargeTouchableAreasItemView)localView).dF(true);
          }
          for (;;)
          {
            this.kGH.kGM.setVisibility(0);
            paramView = ((af)localObject).field_username;
            ((LargeTouchableAreasItemView)localView).kEk = new LargeTouchableAreasItemView.a()
            {
              public final void dG(boolean paramAnonymousBoolean)
              {
                GMTrace.i(9115531214848L, 67916);
                if (paramAnonymousBoolean) {
                  ((SelectDelRoomMemberUI)SelectDelRoomMemberUI.a.a(SelectDelRoomMemberUI.a.this)).iiR.add(paramView);
                }
                for (;;)
                {
                  SelectDelRoomMemberUI.f((SelectDelRoomMemberUI)SelectDelRoomMemberUI.a.a(SelectDelRoomMemberUI.a.this));
                  GMTrace.o(9115531214848L, 67916);
                  return;
                  ((SelectDelRoomMemberUI)SelectDelRoomMemberUI.a.a(SelectDelRoomMemberUI.a.this)).iiR.remove(paramView);
                }
              }
            };
            break;
            ((LargeTouchableAreasItemView)localView).dF(false);
          }
          label723:
          this.kGH.kGJ.bXE();
          break label389;
          label736:
          this.kGH.kGJ.bXE();
          break label389;
          label749:
          this.kGH.kGJ.bXE();
          break label389;
          label762:
          paramView = str;
          break label420;
          label768:
          paramViewGroup = ((af)localObject).gcf;
          break label563;
          this.kGH.kGK.setText("");
        }
        label793:
        paramViewGroup = "";
      }
    }
    
    private static final class a
    {
      public MaskLayout kGJ;
      public TextView kGK;
      public ImageView kGL;
      public ImageButton kGM;
      public TextView kjm;
      
      public a()
      {
        GMTrace.i(9112846860288L, 67896);
        GMTrace.o(9112846860288L, 67896);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/chatroom/ui/SelectDelRoomMemberUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */