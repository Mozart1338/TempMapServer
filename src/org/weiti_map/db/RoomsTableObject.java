package org.weiti_map.db;

import java.util.ArrayList;
import java.util.List;

public class RoomsTableObject extends AbstractTableObject {

	private final List<RoomObj> sala;

	RoomsTableObject() {
		sala = new ArrayList<RoomObj>();
	}

	void add(RoomObj room) {
		sala.add(room);
	}

	public void fillData(String[][] data) {
		String[] poj_sala = new String[5];
		int row_no = 0;

		for (RoomObj poj_prac_temp : sala) {
			poj_sala = poj_prac_temp.getData();
			row_no = Integer.parseInt(poj_sala[0]) - 1;
			for (int k = 0; k < 5; k++) {
				data[row_no][k] = poj_sala[k];
			}
		}

	}

	public int getRowCount() {
		return sala.size();
	}

}
