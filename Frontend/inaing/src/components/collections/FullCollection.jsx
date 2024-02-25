import React from 'react'
import styled from 'styled-components'
import ItemCard from '../card/ItemCard'
import ItemCardList from '../card/ItemCardList'

const Wrapper = styled.div`
  height : 100%;
  margin : 10px auto;
`
const Top = styled.div``
const Grid = styled.div`
  display : grid;
  grid-template-columns : repeat(auto-fit,minmax(280px, 1fr));
  gap : 2px;
  margin : 0 auto;
`
const Item = styled.div`
  width : fit-content;
  height : fit-content;
`
function FullCollection() {
  return (
    <Wrapper>
      <Top></Top>
      <Grid>
        <Item>
          <ItemCardList/>
        </Item>
        <Item>
          <ItemCardList/>
        </Item>
        <Item>
          <ItemCardList/>
        </Item>
        <Item>
          <ItemCardList/>
        </Item>
        <Item>
          <ItemCardList/>
        </Item>
        <Item>
          <ItemCardList/>
        </Item>
        <Item>
          <ItemCardList/>
        </Item>
        <Item>
          <ItemCardList/>
        </Item>
      </Grid>
    </Wrapper>
  )
}

export default FullCollection