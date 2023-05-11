import { useState } from 'react'
import reactLogo from './assets/react.svg'

import './App.css'
import { Card } from './components/card/card';
import { FoodData } from './interface/FoodData';

function App() {

  const data: FoodData[] = [];
  return (
    <div className="container">
      <h1>Cardápio</h1>
      <div className="card-grid">
        {data.map(fooData => 
        <Card
        price={fooData.price}
        title={fooData.title}
        image={fooData.image}/>)}
      </div>
    </div>
  )
}

export default App
