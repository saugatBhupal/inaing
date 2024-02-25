import React from 'react'
import styled from 'styled-components'
import NavBar from '../components/navigation/NavBar'
import Padding from '../components/widget/Padding'
import LoginCard from '../components/card/Login/LoginCard'
import FeaturesSection from '../components/sections/FeaturesSection'

const Wrapper = styled.div`
  color : #0f2c56;
`
const Container = styled.div`
  padding-bottom : 80px;
`
const Title = styled.div`
  font-size : 80px;
  margin : 40px;
`
const Center = styled.div`
  width : fit-content;
  margin : auto;
`
function LoginPage() {
  return (
    <Wrapper>
      <NavBar/>
      <Padding/>
      <Container>
          <Title>
            Login
          </Title>
          <Center>
            <LoginCard/>
          </Center>
      </Container>
      <FeaturesSection/>
    </Wrapper>
  )
}

export default LoginPage