import React from 'react'
import styled from 'styled-components'
import logo from '../../assets/images/logo/logo.png'
import post1 from '../../assets/images/social/social-post-1.png'
import post2 from '../../assets/images/social/social-post-2.png'
import post3 from '../../assets/images/social/social-post-3.png'

const Wrapper = styled.div`
  width : 100%;
`
const Title = styled.div`
  display : flex; 
  width : fit-content;
  margin : 80px auto;
  align-items : center;
  margin-bottom : 20px;
`
const Logo = styled.div`
  img{
    height : 120px;
  }
  padding : 30px;
  padding-right : 10px;
`
const Handle = styled.div`
  font-size : 45px;
`
const Grid = styled.div`
  display : grid;
  grid-template-columns: repeat(auto-fit, minmax(10px, 1fr));
  img{
    height : 560px;
  }
`
function SocialPosts() {
  return (
    <Wrapper>
        <Title>
            <Logo>
                <img src={logo} alt="" />
            </Logo>
            <Handle>
                @inaing
            </Handle>
        </Title>
        <Grid>
          <img src= {post3} alt="" />
          <img src= {post1} alt="" />
          <img src= {post2} alt="" />
        </Grid>
    </Wrapper>
  )
}

export default SocialPosts