package A_FinalHomework.View;


import A_FinalHomework.Helper.Helper;
import A_FinalHomework.Model.Hotel;
import A_FinalHomework.Model.Room;
import P_GUI.patikadev.Helper.Config;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BookingManagement extends JFrame{
    private JPanel wrapper;
    private JPanel pnl_top;
    private JLabel lbl_welcome;
    private JButton btn_logout;
    private JTabbedPane tab_opeartor;
    private JPanel pnl_hotel_list;
    private JScrollPane scrl_hotel_list;
    private JTable tbl_hotel_list;
    private JPanel pnl_user_form;
    private JTextField hotelNameFld;
    private JTextField hotelLocFld;
    private JButton htlAdd;
    private JPanel pnl_users_form;
    private JTextField htlLocSearchFld;
    private JTextField htlNameSearchFld;
    private JButton btn_user_sh;
    private JCheckBox freeOtoCBX;
    private JCheckBox freeWFCBX;
    private JCheckBox swmPoolCBX;
    private JCheckBox ftnsCntCBX;
    private JCheckBox htlCngrCBX;
    private JCheckBox spaCBX;
    private JCheckBox alwRSrvcCBX;
    private JPanel pnl_room_list;
    private JComboBox cmb_pnsy_type;
    private JTextField fld_bed_num;
    private JCheckBox cbx_television;
    private JCheckBox cbx_minibar;
    private JCheckBox cbx_gameConsole;
    private JCheckBox cbx_meterSquare;
    private JCheckBox cbx_safe;
    private JCheckBox cbx_projection;
    private JTextField fld_sum_price;
    private JTextField fld_win_price;
    private JButton btn_room_add;
    private JTable tbl_room_list;
    private JTextField fld_bed_num_search;
    private JButton btn_roomSearch;
    private JComboBox cbx_hotel_list;
    private JLabel fld_pansiyon_type;
    private JLabel fld_yatak_sayısı;
    private JComboBox cbx_pnsy_type;
    private JTextField fld_reserve_loc;
    private JTextField fld_check_in;
    private JTextField fld_check_out;
    private JComboBox cbx_roomReserve;
    private JButton btn_reserve_srch;
    private JTable tbl_reservable_list;

    // objects
    private Object[] row_hotel_list;
    private Object[] row_room_list;
    private Object[] row_reservable_list;
    // models
    private DefaultTableModel mdl_hotel_list;
    private DefaultTableModel mdl_room_list;
    private DefaultTableModel mdl_reservable_list;
    public BookingManagement(){
        add(wrapper);
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setLocation(P_GUI.patikadev.Helper.Helper.screenCenter("x",getSize()), P_GUI.patikadev.Helper.Helper.screenCenter("y",getSize()));
        setVisible(true);

        // HOTELarama kısmı ve genel gösterim kısmı
        mdl_hotel_list = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                if(column == 0) return false;
                return super.isCellEditable(row, column);
            }
        };

        Object[] col_hotel_list = {"Adı", "Konumu", "Otopark Durumu", "Wifi Hizmeti", "Yüzme Havuzu", "Fitness Center", "Hotel Concierge", "SPA", "Oda Servisi"};
        mdl_hotel_list.setColumnIdentifiers(col_hotel_list);
        row_hotel_list = new Object[col_hotel_list.length];

        loadHotelList();

        tbl_hotel_list.setModel(mdl_hotel_list);
        tbl_hotel_list.getTableHeader().setReorderingAllowed(false);

        // ROOM arama kısmı ve genel gösterim kısmı
            //cbx hotel list düzenleme
        ArrayList<Hotel> Hotels = Hotel.getHotelList("","");
        for(Hotel hotel : Hotels)
            cbx_hotel_list.addItem(hotel.getHotelName());
            // end cbx hotel list düzenleme
        mdl_room_list = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                if(column == 0) return false;
                return super.isCellEditable(row, column);
            }
        };

        Object[] col_room_list = {"Hotel Adı", "Pansiyon Tipi" , "Yatak Sayısı", "Televizyon", "Minibar", "Oyun Konsolu", "Ferah", "Projection", "Kış Fiyatı", "Yaz Fiyatı"};
        mdl_room_list.setColumnIdentifiers(col_room_list);
        row_room_list = new Object[col_room_list.length];

        loadRoomList();

        tbl_room_list.setModel(mdl_room_list);
        tbl_room_list.getTableHeader().setReorderingAllowed(false);
        // ADD HOTEL BUTTON LISTENER
        htlAdd.addActionListener(e -> {
            if(Helper.isEmpty(hotelNameFld) || Helper.isEmpty(hotelLocFld)){
                Helper.showMsg("fill");
            }else {
                Hotel hotel = new Hotel(hotelNameFld.getText(), hotelLocFld.getText(), freeOtoCBX.isSelected(), freeWFCBX.isSelected(), swmPoolCBX.isSelected(), ftnsCntCBX.isSelected(), htlCngrCBX.isSelected(), spaCBX.isSelected(), alwRSrvcCBX.isSelected());

                if (hotel.addHotel()) {
                    Helper.showMsg("suc");
                    loadHotelList();
                    loadRoomList();
                } else {
                    Helper.showMsg("err");
                }
            }
        });
        // hotel ara adına ve loc'a göre
        btn_user_sh.addActionListener(e -> {
            loadHotelList(Hotel.getHotelList(htlNameSearchFld.getText(), htlLocSearchFld.getText()));
        });

        // oda ekle
        btn_room_add.addActionListener(e ->{
            if(Helper.isEmpty(fld_bed_num) || Helper.isEmpty(fld_sum_price) || Helper.isEmpty(fld_win_price))
                Helper.showMsg("fill");
            else{
                int hotelID = 1;
                int bedNum = 0;
                double summerPrice = 0;
                double winterPrice = 0;
                try{

                    hotelID = Hotel.itemToID(cbx_hotel_list.getSelectedItem().toString());
                    bedNum = Integer.parseInt(fld_bed_num.getText());
                    summerPrice = Double.parseDouble(fld_sum_price.getText());
                    winterPrice = Double.parseDouble(fld_win_price.getText());

                    Room room = new Room(hotelID, cmb_pnsy_type.getSelectedItem().toString(), bedNum , cbx_television.isSelected(), cbx_minibar.isSelected(), cbx_gameConsole.isSelected(),
                            cbx_meterSquare.isSelected(), cbx_safe.isSelected(), cbx_projection.isSelected(), summerPrice, winterPrice);

                    if(room.addRoom()){
                        Helper.showMsg("suc");
                        loadRoomList();
                    }
                    else
                        Helper.showMsg("err");
                }catch (Exception ef){
                    Helper.showMsg("typeErr");
                }
            }
        });
        // oda ara
        btn_roomSearch.addActionListener(e ->{
            String pnsType = cbx_pnsy_type.getSelectedItem().toString();
            try{
                int bedNum = Integer.parseInt(fld_bed_num_search.getText());
                loadRoomList(Room.getRoomList(bedNum, pnsType));
            }catch (Exception er){
                Helper.showMsg("typeErr");
            }
        });

        // reserve olunabilecek oda ara
        mdl_reservable_list = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;

            }
        };

        Object[] col_reservable_list = {"Hotel Adı", "Pansiyon Tipi" , "Yetişkinler için Ücret", "Çocuklar için Ücret"};
        mdl_reservable_list.setColumnIdentifiers(col_reservable_list);
        row_reservable_list = new Object[col_reservable_list.length];

        tbl_reservable_list.setModel(mdl_reservable_list);
        tbl_reservable_list.getTableHeader().setReorderingAllowed(false);


        btn_reserve_srch.addActionListener(e ->{
            try {
                String pnsType = cbx_roomReserve.getSelectedItem().toString();
                SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");

                Date checkIn = formatter.parse(fld_check_in.getText());
                Date checkOut = formatter.parse(fld_check_out.getText());

                String loc = fld_reserve_loc.getText();

                loadReservableList(Room.getReservableList(checkIn, checkOut, pnsType, loc));
            }catch (Exception er){
                System.out.println("di " + er.getMessage());
            }
        });
    }

    public static void main(String[] args) {
        Helper.setLayout();
        BookingManagement a = new BookingManagement();
    }

    public void loadHotelList(ArrayList<Hotel>  hotels){
        DefaultTableModel clearModel = (DefaultTableModel) tbl_hotel_list.getModel();
        clearModel.setRowCount(0);

        int i;
        for(Hotel hotel : hotels){
            i = 0;
            row_hotel_list[i++] = hotel.getHotelName();
            row_hotel_list[i++] = hotel.getHotelLoc();
            row_hotel_list[i++] = hotel.isFreeOto() ? "Var" : "Yok";
            row_hotel_list[i++] = hotel.isFreeWIFI() ? "Var" : "Yok";
            row_hotel_list[i++] = hotel.isSwimmingPool() ? "Var" : "Yok";
            row_hotel_list[i++] = hotel.isFitnessCenter() ? "Var" : "Yok";
            row_hotel_list[i++] = hotel.isHotelConcierge() ? "Var" : "Yok";
            row_hotel_list[i++] = hotel.isSPA() ? "Var" : "Yok";
            row_hotel_list[i] = hotel.isAlwRoomService() ? "Var" : "Yok";

            mdl_hotel_list.addRow(row_hotel_list);
        }
    }

    public void loadHotelList(){
        DefaultTableModel clearModel = (DefaultTableModel) tbl_hotel_list.getModel();
        clearModel.setRowCount(0);

        int i;
        cbx_hotel_list.removeAllItems();
        for(Hotel hotel : Hotel.getHotelList("","")){
            i = 0;
            row_hotel_list[i++] = hotel.getHotelName() ;
            row_hotel_list[i++] = hotel.getHotelLoc();
            row_hotel_list[i++] = hotel.isFreeOto() ? "Var" : "Yok";
            row_hotel_list[i++] = hotel.isFreeWIFI() ? "Var" : "Yok";
            row_hotel_list[i++] = hotel.isSwimmingPool() ? "Var" : "Yok";
            row_hotel_list[i++] = hotel.isFitnessCenter() ? "Var" : "Yok";
            row_hotel_list[i++] = hotel.isHotelConcierge() ? "Var" : "Yok";
            row_hotel_list[i++] = hotel.isSPA() ? "Var" : "Yok";
            row_hotel_list[i] = hotel.isAlwRoomService() ? "Var" : "Yok";


            cbx_hotel_list.addItem(hotel.getHotelName());
            mdl_hotel_list.addRow(row_hotel_list);
        }
    }

    public void loadRoomList(){
        DefaultTableModel clearModel = (DefaultTableModel) tbl_room_list.getModel();
        clearModel.setRowCount(0);
        int i;
        for(Room room : Room.getRoomList(0,"")){
            i = 0;
            row_room_list[i++] = Hotel.IDtoName(room.getHotelID());
            row_room_list[i++] = room.getPansiyonType();
            row_room_list[i++] = room.getBedNum();
            row_room_list[i++] = room.isTelevision()? "Var" : "Yok";
            row_room_list[i++] = room.isMinibar()? "Var" : "Yok";
            row_room_list[i++] = room.isGameConsole()? "Var" : "Yok";
            row_room_list[i++] = room.isMeterSquare()? "Var" : "Yok";
            row_room_list[i++] = room.isProjection()? "Var" : "Yok";
            row_room_list[i++] = room.getWinterPrice();
            row_room_list[i++] = room.getSummerPrice();

            mdl_room_list.addRow(row_room_list);
        }
    }

    public void loadRoomList(ArrayList<Room>  rooms){
        DefaultTableModel clearModel = (DefaultTableModel) tbl_room_list.getModel();
        clearModel.setRowCount(0);
        int i;
        for(Room room : rooms){
            i = 0;
            row_room_list[i++] = Hotel.IDtoName(room.getHotelID());
            row_room_list[i++] = room.getPansiyonType();
            row_room_list[i++] = room.getBedNum();
            row_room_list[i++] = room.isTelevision()? "Var" : "Yok";
            row_room_list[i++] = room.isMinibar()? "Var" : "Yok";
            row_room_list[i++] = room.isGameConsole()? "Var" : "Yok";
            row_room_list[i++] = room.isMeterSquare()? "Var" : "Yok";
            row_room_list[i++] = room.isProjection()? "Var" : "Yok";
            row_room_list[i++] = room.getWinterPrice();
            row_room_list[i++] = room.getSummerPrice();

            mdl_room_list.addRow(row_room_list);
        }
    }

    public void loadReservableList(ArrayList<Room> rooms){
        DefaultTableModel clearModel= (DefaultTableModel) tbl_reservable_list.getModel();
        clearModel.setRowCount(0);
        int i;
        for(Room reservable : rooms){
            i = 0;
            row_reservable_list[i++] = Hotel.IDtoName(reservable.getHotelID());
            row_reservable_list[i++] = reservable.getPansiyonType();
            row_reservable_list[i++] = reservable.getPrice();
            row_reservable_list[i++] = reservable.getPrice() * 2 / 3;

            mdl_reservable_list.addRow(row_reservable_list);
        }
    }
}
