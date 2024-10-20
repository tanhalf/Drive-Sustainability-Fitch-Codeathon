import React, { useState } from 'react';
import './ItemCounter.css';

function ItemCounter() {
  const [counts, setCounts] = useState({
    small: { bowls: 0, utensils: 0, cups: 0 },
    medium: { bowls: 0, utensils: 0, cups: 0 },
    large: { bowls: 0, utensils: 0, cups: 0 }
  });

  const handleIncrement = (size, item) => {
    setCounts(prevCounts => ({
      ...prevCounts,
      [size]: {
        ...prevCounts[size],
        [item]: prevCounts[size][item] + 1
      }
    }));
  };

  return (
    <div className="item-counter">
      <h2>Count Reusable Items</h2>
      {['small', 'medium', 'large'].map(size => (
        <div key={size} className="counter-section">
          <h3>{size.charAt(0).toUpperCase() + size.slice(1)} Items</h3>
          {['bowls', 'utensils', 'cups'].map(item => (
            <div key={item} className="item">
              <span>{item.charAt(0).toUpperCase() + item.slice(1)}: {counts[size][item]}</span>
              <button onClick={() => handleIncrement(size, item)}>Add {item}</button>
            </div>
          ))}
        </div>
      ))}
    </div>
  );
}

export default ItemCounter;
