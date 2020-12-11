package pl.poznan.put.gol.game;

public class ConwaysCell implements Cell 
{

	protected int i;
	protected int j;

	public ConwaysCell(int i, int j) {
		this.i = i;
		this.j = j;
	}

	@Override
	public Cells neighbors() {
		// TODO implement method ConwaysCell#neighbors()
		//throw new UnsupportedOperationException("Not implemented yet.");
                Cells cells = new Cells();
                cells.add(new ConwaysCell(i-1, j-1));
                cells.add(new ConwaysCell(i-1,j));
                cells.add(new ConwaysCell(i-1,j+1));
                cells.add(new ConwaysCell(i,j-1));
                cells.add(new ConwaysCell(i,j+1));
                cells.add(new ConwaysCell(i+1,j-1));
                cells.add(new ConwaysCell(i+1,j));
                cells.add(new ConwaysCell(i+1,j+1));
                return cells;
                
	}
        
        @Override
        public boolean equals(Object obj)
        {
            if(obj == null) return false;
            if(this == obj) return true;
            ConwaysCell other = (ConwaysCell) obj;
            if(i == other.i && j == other.j)
                return true;
            else return false;
        }

	@Override
	public String toString() {
		return "c(" + i + ":" + j + ")";
	}

}
