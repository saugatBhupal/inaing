import React from 'react'
import styled from 'styled-components'

const Wrapper = styled.div``
const Circle = styled.div`
  height : 40px;
  width : 40px;
  border-radius : 50%;
  background-color : #0f2c56;
  position : relative;
  a{
    position : absolute;
    color : white;
    left : 15px;
    top : 10px;
  }
`
function SizeOption({size}) {
  return (
    <Wrapper>
      <Circle>
        <a>{size}</a>
      </Circle>
    </Wrapper>
  )
}

export default SizeOption