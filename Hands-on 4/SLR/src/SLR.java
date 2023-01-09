
/*******************************************************************************
 *
 * @author yazmin.salinas
 * Date: 01-12-2022
 * Soft Computing
 */



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class SLR extends javax.swing.JFrame {

    /**
     * Creates new form SLR
     */
    boolean bandera=true;
    private DefaultTableModel modeloTabla=new DefaultTableModel();
    RegresionLineal rl =new RegresionLineal();
    
    public SLR() {
        initComponents();
        jTable1.setModel(modeloTabla);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        textField1 = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        textField2 = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        textField3 = new java.awt.TextField();
        textField4 = new java.awt.TextField();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jFileChooser1.setName(""); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("X");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Y");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Y   =      b0     +       b1x");

        button1.setLabel("Calcular");
        button1.setName("CalcularY"); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        label3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label3.setName(""); // NOI18N
        label3.setText("b0 =");

        label4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label4.setName(""); // NOI18N
        label4.setText("b1 =");

        textField3.setName("txtb0"); // NOI18N

        textField4.setName("txtb1"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textField4, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Simple Linear Regression");

        jMenu2.setText("Archivo");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Abrir");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem1);

        jMenuItem2.setText("Salir");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Hands_ON");

        jMenuItem1.setText("Regresion Lineal Simple");
        jMenuItem1.setName("RegresionSimple"); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresionLinealSimple(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /*LEER ARCHIVO*/
    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
       File archivoSeleccionado=obtenerArchivo();
       if(archivoSeleccionado!=null){
           try{
               procesarCsv(archivoSeleccionado);
           }
           catch(IOException io)
                   {
                    System.out.println(io);
                   }
       }       
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed
    /*CALCULO DE REGRESION LINEAL SIMPLE*/
    private void RegresionLinealSimple(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresionLinealSimple
      
        
        
        rl.n=modeloTabla.getRowCount();
        int numero=modeloTabla.getColumnCount();
        numero=numero-1;
        modeloTabla.addColumn("x2"); // TODO add your handling code here:
        modeloTabla.addColumn("xy"); // TODO add your handling code here:
        int a = 0;
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            String  valor= (String) modeloTabla.getValueAt(i, numero);
            String  valor1= (String) modeloTabla.getValueAt(i, numero-1);
             rl.x= Double.parseDouble(valor);
             rl.y= Double.parseDouble(valor1);
             rl.x2= rl.x*rl.x;
             rl.xy=rl.x*rl.y;
            
            rl.suma_x=rl.suma_x+rl.x;
            rl.suma_y=rl.suma_y+rl.y;
            rl.suma_xy=rl.suma_xy+rl.xy;
            rl.suma_x2=rl.suma_x2+rl.x2;
            
            String resultado1=String.valueOf(rl.x2);
            String resultado2=String.valueOf(rl.xy);
            modeloTabla.setValueAt(resultado1, i, numero+1);
            modeloTabla.setValueAt(resultado2, i, numero+2);
         }
       
         rl.b= ( rl.suma_xy - (rl.n*((rl.suma_x/rl.n)*(rl.suma_y/rl.n)))  );
         rl.b3= (  rl.suma_x2 - ( rl.n *( (rl.suma_x/rl.n)*(rl.suma_x/rl.n) ) ) );
         rl.b1= rl.b/ rl.b3;
         rl.b0= (rl.suma_y/rl.n)-(rl.b1* (rl.suma_x/rl.n));
      
         String StrB0=String.valueOf(rl.b0);
         String StrB1=String.valueOf(rl.b1);
         
         textField3.setText(StrB0); 
         textField4.setText(StrB1);
                
    }//GEN-LAST:event_RegresionLinealSimple

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        textField2.setText("");
        rl.X= Double.valueOf(textField1.getText());
        rl.Y=rl.b0+(rl.b1*rl.X);
        String strY= String.valueOf(rl.Y);
        textField2.setText(strY); 
    }//GEN-LAST:event_button1ActionPerformed

    private File obtenerArchivo(){
       JFileChooser fileChooser=new JFileChooser();
       FileNameExtensionFilter filtro=new FileNameExtensionFilter("Archivo de Excel . csv","csv");
       fileChooser.setFileFilter(filtro);
       fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
       int resultado=fileChooser.showOpenDialog(this);
       if(resultado==JFileChooser.CANCEL_OPTION){
            return null;
       }
       else
       {
         File archivoSeleccionado=fileChooser.getSelectedFile();
         return archivoSeleccionado;
       }
      
    }
    
    private void procesarCsv(File archivoSeleccionado)throws IOException{
       BufferedReader input=new BufferedReader(new FileReader(archivoSeleccionado)); 
       String linea;
       String campo;
       ArrayList<String> columnas= new ArrayList<String>();
       while ((linea=input.readLine())!=null)
       {
         ArrayList<String> contenidoFila=new ArrayList<String>();
         int tamaño=linea.length();
         int intAux=0;
         char arregloCadena[]=new char[tamaño];
         arregloCadena=linea.toCharArray();
         for(int i=0;i<tamaño;i++)
         {
            if(arregloCadena[i]==',')
            {
               campo=linea.substring(intAux,i);
               intAux=i+1;
               if(bandera)
               {
                  columnas.add(campo);
               }
               else
               {
                  contenidoFila.add(campo);
               }
            }
            else if(i==tamaño - 1){
                
                   campo=linea.substring(intAux,i+1);
                   if(bandera)
                   {
                      columnas.add(campo);
                      for(int x=0;x<columnas.size();x++)
                      {
                         modeloTabla.addColumn(columnas.get(x));
                      }
                   }
                   else{
                      contenidoFila.add(campo);
                      modeloTabla.addRow(contenidoFila.toArray());
                   }
                   bandera=false;
                       
               }
            }
         }
         input.close();
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SLR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    // End of variables declaration//GEN-END:variables
}
