import React from 'react';
import Link from "next/link"
import { Label } from "@/components/ui/label"
import { Input } from "@/components/ui/input"
import { Checkbox } from "@/components/ui/checkbox"
import { Button } from "@/components/ui/button"


const LoginPage = () => {

  return (
    <div className="flex min-h-screen items-center justify-center bg-gray-100 py-12 px-4 sm:px-6 lg:px-8 dark:bg-gray-950">
      <div className="w-full max-w-md space-y-8">
        <div>
          <img
            alt="Logo"
            className="mx-auto h-12 w-auto"
            height={500}
            src="/logo.png"
            style={{
              aspectRatio: "50/50",
              objectFit: "cover",
            }}
            width={50}
          />
          <h2 className="mt-6 text-center text-3xl font-bold tracking-tight text-gray-900 dark:text-gray-50">
            Sign in to your account
          </h2>
          <p className="mt-2 text-center text-sm text-gray-600 dark:text-gray-400">
            Or{' '}
            <Link
              className="font-medium text-indigo-600 hover:text-indigo-500 dark:text-indigo-500 dark:hover:text-indigo-400"
              href="/register"
            >
               sign up for a new account
            </Link>
          </p>
        </div>
        <form action="#" className="mt-8 space-y-6" method="POST">
          <input defaultValue="true" name="remember" type="hidden" />
          <div className="-space-y-px rounded-md shadow-sm">
            <div>
              <Label className="sr-only" htmlFor="email">
                Email address
              </Label>
              <Input
                autoComplete="email"
                className="relative block w-full appearance-none rounded-none rounded-t-md border  border-gray-300 px-3 py-2 text-gray-900 placeholder-gray-500 focus:z-10 focus:border-indigo-500 focus:outline-none focus:ring-indigo-500  dark:bg-gray-800 dark:text-gray-50 dark:placeholder-gray-400 dark:border-gray-800"
                id="email"
                name="email"
                placeholder="Email address"
                required
                type="email"
              />
            </div>
            <div>
              <Label className="sr-only" htmlFor="password">
                Password
              </Label>
              <Input
                autoComplete="current-password"
                className="relative block w-full appearance-none rounded-none rounded-b-md border  border-gray-300 px-3 py-2 text-gray-900 placeholder-gray-500 focus:z-10 focus:border-indigo-500 focus:outline-none focus:ring-indigo-500  dark:bg-gray-800 dark:text-gray-50 dark:placeholder-gray-400 dark:border-gray-800"
                id="password"
                name="password"
                placeholder="Password"
                required
                type="password"
              />
            </div>
          </div>
          <div className="flex items-center justify-between">
            <div className="flex items-center">
              <Checkbox id="remember-me" name="remember-me" />
              <Label className="ml-2 block text-sm text-gray-900 dark:text-gray-50" htmlFor="remember-me">
                Remember me
              </Label>
            </div>
            <div className="text-sm">
              <Link
                className="font-medium text-indigo-600 hover:text-indigo-500 dark:text-indigo-500 dark:hover:text-indigo-400"
                href="#"
              >
                Forgot your password?
              </Link>
            </div>
          </div>
          <div>
            <Button
              className="group relative flex w-full justify-center rounded-md border border-gray-200 border-transparent bg-indigo-600 py-2 px-4 text-sm font-medium text-white hover:bg-indigo-700 focus:outline-none focus:ring-2 focus:ring-indigo-500 focus:ring-offset-2 dark:bg-indigo-500 dark:hover:bg-indigo-600 dark:focus:ring-indigo-600 dark:focus:ring-offset-gray-950 dark:border-gray-800"
              type="submit"
              
            >
              Sign in
            </Button>
          </div>
        </form>
      </div>
    </div>
  )
}

export default LoginPage;
