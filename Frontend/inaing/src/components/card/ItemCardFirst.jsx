import React from 'react'
import styled from 'styled-components'
import ItemCard from './ItemCard'

const Wrapper = styled.div`
    margin-left : 90px !important;
`
function ItemCardFirst() {
  return (
    <Wrapper><ItemCard/></Wrapper>
  )
}

export default ItemCardFirst