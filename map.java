import java.applet.*;
import javax.swing.*;
import java.text.*;
//import javax.swing.border.*;
//import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class map extends Applet implements ActionListener{
	private Image mapfull;
	Node[] graph = new Node[42];
	Choice start = new Choice();
	Choice end = new Choice();
	Button com = new Button("Compute");
	Button clr = new Button("Clear");
	Label str = new Label("Starting Place");
	Label en = new Label("End Place"); 
	Label di = new Label("Total Distance");
	TextField dist = new TextField(20);
	JProgressBar bar = new JProgressBar();
	String places[] = {"DENR"	,"Ph Sugar commission"	,"Nat'l Broadcasting netwrk"
	,"Dept of Agriculture"	,"Dept of Agriarian Reform"	,"PHILCOA"	,"Nat'l Housing Authority"
	,"PCSO"	,"Quezon City Hall"	,"PNB"	,"Office of the Ombudsman"
	,"DENR-NCR"	,"National Power Corp"	,"BIR"	,"BSP"
	,"SSS"	,"NSO"	,"Register of deeds QC"	,"DOJ"
	,"Nat'l Printing Office"	,"PDEA"	,"Nat'l Electrification Admin"	,"LTO Head Office"};
	//,"--------------------------"};
	int zoomingx = 0, zoomingy = 0,dimensionx = 450, dimensiony = 550;
	public void init() {
		setSize(650,575);
		setLayout(null);		
		for(int i = 0; ; i++){
			start.add(places[i]);
			end.add(places[i]);
			//if(places[i].equalsIgnoreCase("--------------------------"))break;
			if(places[i].equalsIgnoreCase("LTO Head Office"))break;
		}
		//start.select("--------------------------");
		//end.select("--------------------------");
		Instanciate();
		clr.setEnabled(false);
		add(str);str.setBounds(dimensionx+25, 10, 150, 10);
		add(start);start.setBounds(dimensionx+25, 25, 150, 150);
		add(en);en.setBounds(dimensionx+25, 60, 150, 10);
		add(end);end.setBounds(dimensionx+25, 75, 150, 150);
		add(com);com.setBounds(dimensionx+25, 100, 150, 20);
		add(clr);clr.setBounds(dimensionx+25, 120, 150, 20);
		add(di);di.setBounds(dimensionx+25, 150, 150, 20);
		add(dist);dist.setBounds(dimensionx+25, 180, 150, 20);dist.setEnabled(false);
		add(bar);bar.setBounds(dimensionx+25, 210, 150, 20);
		bar.setStringPainted(true);
		bar.setBorderPainted(true);
		mapfull = getImage(getDocumentBase(), "imgs\\cropQuadHD.jpg");	
		com.addActionListener(this);
		clr.addActionListener(this);
	}
	public void paint(Graphics g) {
		g.drawImage(mapfull,zoomingx,zoomingy,dimensionx,dimensiony,this);							
	}
	public void clear() { 
		Graphics g = getGraphics(); 
		Dimension d = getSize();
		Color c = getBackground(); 
		g.setColor(c);
		g.fillRect(0,0,d.width,d.height); 		
		repaint(); 
	}
	void Instanciate() {
		for (int x = 0; x < 42; x++) {
			graph[x] = new Node(x);
			switch (x) {
			case 0:
				graph[x].SetXY(248,43);
				graph[x].ArcSet.add(2);
				break;
			case 1:
				graph[x].SetXY(217,138);
				graph[x].ArcSet.add(23);
				graph[x].ArcSet.add(24);
				break;
			case 2:
				graph[x].SetXY(267, 63);
				graph[x].ArcSet.add(0);
				graph[x].ArcSet.add(25);
				break;
			case 3:
				graph[x].SetXY(274, 108);
				graph[x].ArcSet.add(24);
				break;
			case 4:
				graph[x].SetXY(318, 71);
				graph[x].ArcSet.add(25);
				break;
			case 5:
				graph[x].SetXY(400, 81);
				graph[x].ArcSet.add(26);
				break;
			case 6:
				graph[x].SetXY(406, 127);
				graph[x].ArcSet.add(26);
				break;
			case 7:
				graph[x].SetXY(333, 202);
				graph[x].ArcSet.add(29);
				break;
			case 8:
				graph[x].SetXY(383, 199);
				graph[x].ArcSet.add(30);
				break;
			case 9:
				graph[x].SetXY(407, 174);
				graph[x].ArcSet.add(27);
				break;
			case 10:
				graph[x].SetXY(136, 257);
				graph[x].ArcSet.add(23);
				graph[x].ArcSet.add(31);
				break;
			case 11:
				graph[x].SetXY(342, 290);
				graph[x].ArcSet.add(29);
				graph[x].ArcSet.add(14);
				break;
			case 12:
				graph[x].SetXY(159, 322);
				graph[x].ArcSet.add(31);
				graph[x].ArcSet.add(41);
				break;
			case 13:
				graph[x].SetXY(298, 380);
				graph[x].ArcSet.add(34);
				graph[x].ArcSet.add(32);
				break;
			case 14:
				graph[x].SetXY(343, 338);
				graph[x].ArcSet.add(11);
				graph[x].ArcSet.add(34);
				break;
			case 15:
				graph[x].SetXY(362, 400);
				graph[x].ArcSet.add(36);
				break;
			case 16:
				graph[x].SetXY(343, 429);
				graph[x].ArcSet.add(36);
				graph[x].ArcSet.add(17);
				break;
			case 17:
				graph[x].SetXY(343, 449);
				graph[x].ArcSet.add(16);
				graph[x].ArcSet.add(38);
				break;
			case 18:
				graph[x].SetXY(288, 466);
				graph[x].ArcSet.add(35);
				graph[x].ArcSet.add(37);
				break;
			case 19:
				graph[x].SetXY(222, 482);
				graph[x].ArcSet.add(39);
				graph[x].ArcSet.add(41);
				break;
			case 20:
				graph[x].SetXY(277, 487);
				graph[x].ArcSet.add(37);
				graph[x].ArcSet.add(40);
				break;
			case 21:
				graph[x].SetXY(310, 485);
				graph[x].ArcSet.add(37);
				graph[x].ArcSet.add(38);
				break;
			case 22:
				graph[x].SetXY(343, 517);
				graph[x].ArcSet.add(38);
				break;
			case 23:
				graph[x].SetXY(86, 141);
				graph[x].ArcSet.add(1);
				graph[x].ArcSet.add(10);
				break;
			case 24:
				graph[x].SetXY(274, 138);
				graph[x].ArcSet.add(1);
				graph[x].ArcSet.add(28);
				break;
			case 25:
				graph[x].SetXY(288, 81);
				graph[x].ArcSet.add(2);
				graph[x].ArcSet.add(3);
				break;
			case 26:
				graph[x].SetXY(387, 90);
				graph[x].ArcSet.add(4);
				graph[x].ArcSet.add(5);
				break;
			case 27:
				graph[x].SetXY(412, 148);
				graph[x].ArcSet.add(6);
				break;
			case 28:
				graph[x].SetXY(296, 182);
				graph[x].ArcSet.add(7);
				break;
			case 29:
				graph[x].SetXY(343, 204);
				graph[x].ArcSet.add(8);
				graph[x].ArcSet.add(11);
				break;
			case 30:
				graph[x].SetXY(397, 191);
				graph[x].ArcSet.add(9);
				break;
			case 31:
				graph[x].SetXY(173, 304);
				graph[x].ArcSet.add(10);
				graph[x].ArcSet.add(12);
				graph[x].ArcSet.add(32);
				break;
			case 32:
				graph[x].SetXY(226, 344);
				graph[x].ArcSet.add(31);
				graph[x].ArcSet.add(13);
				graph[x].ArcSet.add(33);
				break;
			case 33:
				graph[x].SetXY(212, 384);
				graph[x].ArcSet.add(35);
				graph[x].ArcSet.add(32);
				break;
			case 34:
				graph[x].SetXY(342, 393);
				graph[x].ArcSet.add(36);
				graph[x].ArcSet.add(13);
				graph[x].ArcSet.add(14);
				break;
			case 35:
				graph[x].SetXY(270, 448);
				graph[x].ArcSet.add(18);
				graph[x].ArcSet.add(39);
				graph[x].ArcSet.add(33);
				break;
			case 36:
				graph[x].SetXY(343, 401);
				graph[x].ArcSet.add(15);
				graph[x].ArcSet.add(16);
				graph[x].ArcSet.add(34);
				break;
			case 37:
				graph[x].SetXY(292, 470);
				graph[x].ArcSet.add(18);
				graph[x].ArcSet.add(20);
				graph[x].ArcSet.add(21);
				break;
			case 38:
				graph[x].SetXY(341, 490);
				graph[x].ArcSet.add(21);
				graph[x].ArcSet.add(22);
				graph[x].ArcSet.add(17);
				break;
			case 39:
				graph[x].SetXY(228, 487);
				graph[x].ArcSet.add(19);
				graph[x].ArcSet.add(40);
				graph[x].ArcSet.add(35);
				break;
			case 40:
				graph[x].SetXY(253, 509);
				graph[x].ArcSet.add(39);
				graph[x].ArcSet.add(20);
				break;
			case 41:
				graph[x].SetXY(110, 368);
				graph[x].ArcSet.add(19);
				graph[x].ArcSet.add(12);
				break;
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		int s = 0;
		double tempDist = 0;
		int tempIndex = 0;
		Graphics g = getGraphics();
		g.setColor(Color.RED);
		if(e.getSource() == com){
			if(start.getSelectedItem().equalsIgnoreCase(end.getSelectedItem())){
				JOptionPane.showMessageDialog(null, "You are at your Destination Destination", "Error",JOptionPane.WARNING_MESSAGE);
				return;
			}
			for(int x = 0;x < 42; x++){
				if(x == start.getSelectedIndex())graph[x].total = 0;
			}
			do {					
				for (s = 0; graph[s].visited; s++)
					;// s stands for smallest
				for (int x = s; x < 42; x++)
					if (!graph[x].visited && graph[x].total < graph[s].total)
						s = x;
				if (s == end.getSelectedIndex())
					break;
				else
					for (ListNode util = graph[s].ArcSet.head(); util != null; util = util.next) {
						if (graph[util.data].visited)
							continue;
						tempDist = graph[s].total + Math.abs(Math.sqrt((Math.pow((graph[s].x-graph[util.data].x),2))+(Math.pow((graph[s].y-graph[util.data].y),2))));
						tempIndex = s;
						if (tempDist < graph[util.data].total) {
							graph[util.data].total = tempDist;
							graph[util.data].origin = tempIndex;
						}
					}
				graph[s].visited = true;												
			} while (true);//Infinite Loop(May breaker naman Eh! To do when compute button is clicked
			for(int i=0;i<=100;i++){
				bar.setValue(i);
				//JCanvas.sleep(50);
			}
			for(int util=end.getSelectedIndex();util!=start.getSelectedIndex();util=graph[util].origin){
				g.drawLine(graph[util].x,graph[util].y,graph[graph[util].origin].x,graph[graph[util].origin].y);
			}
			DecimalFormat df = new DecimalFormat("#.##");
			dist.setText(String.valueOf(df.format((double)tempDist/266)) + " km");
			start.setEnabled(false);
			end.setEnabled(false);
			com.setEnabled(false);
			clr.setEnabled(true);
		}		
		if(e.getSource() == clr) {
			s = tempIndex = 0;
			tempDist = 0.0;		
			//start.select("--------------------------");
			//end.select("--------------------------");
			dist.setText(" ");
			clear();
			for(int x = 0; x < 42; x++){
				graph[x].Refresh(x);
			}
			start.setEnabled(true);
			end.setEnabled(true);
			com.setEnabled(true);
			clr.setEnabled(false);
		}
	}	
}
