import React from 'react'
import styled from 'styled-components';

const Wrapper = styled.div``
const Circle = styled.div`
  height : 20px;
  width : 20px;
  border-radius : 50%;
`
function ColorOption({code}) {
  return (
    <Wrapper>
      <Circle style={{backgroundColor : code}}>

      </Circle>
    </Wrapper>
  )
}

export default ColorOption;