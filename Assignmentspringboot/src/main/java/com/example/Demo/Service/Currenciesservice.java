package com.example.Demo.Service;

import java.util.List;


import com.example.Demo.model.Currencies;

public interface Currenciesservice {
	public void add(Currencies Currencies );
	public List<Currencies > show( );
	public void delete(int id);
	public void update(Currencies  Currencies );
}
